package my.lovely.marketanalog.presentation.card

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.marketanalog.R
import my.lovely.marketanalog.databinding.FragmentCardPaymentBinding
import my.lovely.marketanalog.presentation.pay.PaymentViewModel


@AndroidEntryPoint
class CardFragment : Fragment(R.layout.fragment_card_payment) {

    private lateinit var binding: FragmentCardPaymentBinding
    private val viewModel: PaymentViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCardPaymentBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receivedMoney = arguments?.getFloat("amount", 0F) ?: 0F
        binding.tvCardText.text = getString(R.string.card_text, receivedMoney)

        binding.edCardYear.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Не используется
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Не используется
            }

            override fun afterTextChanged(s: Editable?) {
                if (s?.length == 2 && s.length < 3) {
                    binding.edCardYear.setText(String.format("%s/", s))
                    binding.edCardYear.setSelection(binding.edCardYear.text?.length ?: 0)
                }
            }
        })

        binding.btCardOrder.setOnClickListener {
            if (binding.edCardCVV.text?.toString()?.length == 0 || binding.edCardNumber.text?.toString()?.length!! < 16 || binding.edCardCVV.text!!.length < 3) {
                Toast.makeText(context, R.string.card_error, Toast.LENGTH_SHORT).show()
            } else {
                showPositive()
            }
        }
    }

    private fun showPositive() {
        val dialog = Dialog(requireContext())

        viewModel.clearDB()

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.alert_dialog_cash_positive)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btAlertGoMain: Button = dialog.findViewById(R.id.btCashGoToMain)
        val tvAlertThanks: TextView = dialog.findViewById(R.id.tvThanksCash)

        tvAlertThanks.text = getString(R.string.card_positive)

        dialog.window?.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
            WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
        )

        btAlertGoMain.setOnClickListener {
            dialog.dismiss()
            findNavController().navigate(R.id.action_cardFragment_to_asiaFragment)
        }

        dialog.show()
    }


}