package my.lovely.marketanalog.presentation.registration

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.marketanalog.R
import my.lovely.marketanalog.SharedPrefsService
import my.lovely.marketanalog.databinding.FragmentRegistrationBinding

@AndroidEntryPoint
class RegistrationFragment: Fragment(R.layout.fragment_registration) {

    private val registrationViewModel: RegistrationViewModel by viewModels()
    private lateinit var binding : FragmentRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registrationViewModel.progressBar.observe(viewLifecycleOwner){
            if (it == true) {
                binding.progressBar.isVisible = true
                binding.linearRegHide.isVisible = false
            } else {
                binding.progressBar.isVisible = false
                binding.linearRegHide.isVisible = true
            }
        }

        binding.btLogIn.setOnClickListener {
            val login = binding.edRegLogin.text.toString()
            val passwd = binding.edRegPassword.text.toString()
            val email = binding.edRegEmail.text.toString()
            val number = binding.edRegPhone.text.toString()
            val adress = binding.edRegAdress.text.toString()

            if(login.length == 0 || passwd.length == 0 || email.length == 0 || number.length < 11 || adress.length == 0){
                Toast.makeText(context, R.string.reg_end, Toast.LENGTH_SHORT).show()
            }

            registrationViewModel.sendPostRegistration(login = login, password = passwd, email = email, number = number.toInt(), adress = adress )
            registrationViewModel.registration.observe(viewLifecycleOwner){
                if(it == 200){
                    findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
                } else {
                    binding.tvRegError.text = getString(R.string.reg_error)
                    binding.tvRegError.isVisible = true
                    Log.d("MyLog","Ошибка")
                }
            }
        }

        binding.tvRegLogIn.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
    }
}