package my.lovely.marketanalog.presentation.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.marketanalog.R
import my.lovely.marketanalog.SharedPrefsService
import my.lovely.marketanalog.databinding.FragmentLoginBinding

@AndroidEntryPoint
class LoginFragment: Fragment(R.layout.fragment_login) {

    private val loginViewModel: LoginViewModel by viewModels()
    private lateinit var binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginViewModel.progressBar.observe(viewLifecycleOwner){
            if (it == true) {
                binding.progressBar.isVisible = true
                binding.linearLogHide.isVisible = false
            } else {
                binding.progressBar.isVisible = false
                binding.linearLogHide.isVisible = true
            }
        }

        binding.btLogIn.setOnClickListener {
            val login = binding.edLogLogin.text.toString()
            val passwd = binding.edLogPasswd.text.toString()
            loginViewModel.sendPostLogin(login = login, password = passwd)
            loginViewModel.login.observe(viewLifecycleOwner){
                Log.d("MyLog","in login fragment ${it}")
                if(it.code == 200){
                    SharedPrefsService.putIsUserLogin(value = true)
                    SharedPrefsService.putUserLogin(value = login)
                    findNavController().navigate(R.id.action_loginFragment_to_profileFragment2)
                } else {
                    binding.tvLogError.text = getString(R.string.login_error)
                    binding.tvLogError.isVisible = true
                    Log.d("MyLog","Ошибка")
                }
                /*if(it.logIn){
                    findNavController().navigate(R.id.action_loginFragment_to_profileFragment)
                } else {
                    binding.tvLogError.text = it.exception
                    binding.tvLogError.isVisible = true
                    Log.d("MyLog","Ошибка ${it.exception}")
                }*/
            }
        }

        binding.tvLogRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
    }
}