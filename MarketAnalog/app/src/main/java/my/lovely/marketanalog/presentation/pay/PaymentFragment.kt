package my.lovely.marketanalog.presentation.pay

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputEditText
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.marketanalog.R
import my.lovely.marketanalog.SharedPrefsService
import my.lovely.marketanalog.databinding.FragmentAsiaMenuBinding
import my.lovely.marketanalog.databinding.FragmentPaymentBinding
import my.lovely.marketanalog.presentation.basket.BasketViewModel

@AndroidEntryPoint
class PaymentFragment : Fragment(R.layout.fragment_payment) {

    private lateinit var binding: FragmentPaymentBinding
    private val viewModel: PaymentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPaymentBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receivedMoney = arguments?.getFloat("amount", 0F) ?: 0F

        val isUserLogin = SharedPrefsService.getIsUserLogin()
        if(isUserLogin == true){
            binding.edAdress.setText(SharedPrefsService.getUserAdres())
            binding.edEmail.setText(SharedPrefsService.getUserEmail())
        }

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.rbSBP -> {
                    binding.rbSBP.isChecked = true
                    binding.rbCard.isChecked = false
                    binding.rbCash.isChecked = false
                }

                R.id.rbCard -> {
                    binding.rbCard.isChecked = true
                    binding.rbCash.isChecked = false
                    binding.rbSBP.isChecked = false
                }

                R.id.rbCash -> {
                    binding.rbCash.isChecked = true
                    binding.rbSBP.isChecked = false
                    binding.rbCard.isChecked = false
                }
            }
        }

        binding.btOrder.setOnClickListener {
            if (binding.rbCard.isChecked) {
                val bundle = bundleOf("amount" to receivedMoney)
                findNavController().navigate(R.id.action_paymentFragment_to_cardFragment,bundle)
            }
            if (binding.rbCash.isChecked) {
                Log.d("MyLog", "showDialog")
                showCashPositive(money = receivedMoney)
            }
            if (binding.rbSBP.isChecked) {
                showSbpDialog(money = receivedMoney)
            }
        }
    }

    private fun showCashPositive(money: Float) {
        val dialog = Dialog(requireContext())

        viewModel.clearDB()

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.alert_dialog_cash_positive)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btAlertGoMain: Button = dialog.findViewById(R.id.btCashGoToMain)
        val tvAlertThanks: TextView = dialog.findViewById(R.id.tvThanksCash)

        tvAlertThanks.text = getString(R.string.cash_positive, money)

        dialog.window?.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
        )

        btAlertGoMain.setOnClickListener {
            dialog.dismiss()
            findNavController().navigate(R.id.action_paymentFragment_to_asiaFragment)
        }

        dialog.show()
    }

    private fun showSbpDialog(money: Float){
        val dialog = Dialog(requireContext())

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.alert_dialog_sbp)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btAlertGoMain: Button = dialog.findViewById(R.id.btSbpBack)
        val tvAlertThanks: TextView = dialog.findViewById(R.id.tvSbpText)

        tvAlertThanks.text = getString(R.string.qr, money)

        dialog.window?.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
        )

        btAlertGoMain.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
    /*private fun showCardDialog(money: Float){
        val dialog = Dialog(requireContext())

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.alert_dialog_card_payment)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val editText: EditText = dialog.findViewById(R.id.edCardYear)
        val tvAlertCard: TextView = dialog.findViewById(R.id.tvCardText)

        tvAlertCard.text = getString(R.string.card_text, money)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Не используется
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Не используется
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 2 && s.length < 3) {
                    editText.setText(String.format("%s/", s))
                    editText.setSelection(editText.text?.length ?: 0)
                }
            }
        })


        dialog.window?.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH
        )

        dialog.window?.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )

        dialog.setOnKeyListener { _, keyCode, _ ->
            keyCode == KeyEvent.KEYCODE_BACK
        }

        dialog.show()
    }*/

}