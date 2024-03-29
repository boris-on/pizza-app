package my.lovely.marketanalog.presentation.profile

import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import my.lovely.marketanalog.R
import my.lovely.marketanalog.SharedPrefsService
import my.lovely.marketanalog.databinding.FragmentAsiaMenuBinding
import my.lovely.marketanalog.databinding.FragmentProfileBinding
import my.lovely.marketanalog.presentation.login.LoginViewModel
import kotlin.coroutines.coroutineContext

@AndroidEntryPoint
class ProfileFragment: Fragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding
    private val profileViewModel: ProfileViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val isUserLogin = SharedPrefsService.getIsUserLogin()

        if(isUserLogin == false) {
            findNavController().navigate(R.id.action_profileFragment_to_registrationFragment)
        } else {
            val login = SharedPrefsService.getUserLogin()
            profileViewModel.getUserInfo(login = login ?: "ligma")

            viewLifecycleOwner.lifecycleScope.launch {
                binding.profileProgressBar.visibility = View.VISIBLE
                delay(3000)
                binding.profileProgressBar.visibility = View.INVISIBLE

                profileViewModel.userInfo.observe(viewLifecycleOwner){
                    if(it != null){
                        if(it.address != null){
                            SharedPrefsService.putUserAdres(value = it.address)
                        }

                        if(it.email != null){
                            SharedPrefsService.putUserEmail(value = it.email)
                            Log.d("MyLog","put email ${it.email}")
                        }

                        if(it.phone != null){
                            SharedPrefsService.putUserNumber(value = it.phone)
                        }
                        Log.d("MyLog","in login fragment ${it}")
                    }
                }

                binding.edRegEmailProfile.setText(SharedPrefsService.getUserEmail())
                binding.edRegAdressProfile.setText(SharedPrefsService.getUserAdres())
                binding.edRegPhoneProfile.setText(SharedPrefsService.getUserNumber())
            }



            binding.btProfileExit.setOnClickListener {
                SharedPrefsService.putIsUserLogin(value = false)
                SharedPrefsService.putUserLogin("")
                SharedPrefsService.putUserNumber("")
                SharedPrefsService.putUserEmail("")
                SharedPrefsService.putUserAdres("")
                findNavController().navigate(R.id.action_profileFragment_to_registrationFragment)
            }
        }
    }
}