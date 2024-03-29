package my.lovely.marketanalog

import android.content.Context
import android.content.SharedPreferences
import my.lovely.marketanalog.app.App

object SharedPrefsService {

    private const val USER_LOGIN = "IS_LOGIN"
    private const val USER_NAME = "USER_NAME"
    private const val USER_NUMBER = "USER_NUMBER"
    private const val USER_ADRES = "USER_ADRES"
    private const val USER_EMAIL = "USER_EMAIL"
    private const val USER_LOGIN_VALUE = "USER_LOGIN"

    private val appSharedPreference: SharedPreferences =
        App.INSTANCE.getSharedPreferences(App.INSTANCE.packageName, Context.MODE_PRIVATE)
    fun getIsUserLogin(): Boolean? =
        when (appSharedPreference.getInt(USER_LOGIN, 0)) {
            0 -> false
            1 -> true
            else -> null
        }


    fun putIsUserLogin(value: Boolean){
        appSharedPreference.edit().putInt(
            USER_LOGIN, when (value) {
                false -> 0
                true -> 1
                else -> 2
            }
        ).apply()
    }

    fun getUserAdres(): String? =
        getString(key = USER_ADRES)
    fun getUserNumber(): String? =
        getString(key = USER_NUMBER)

    fun getUserName(): String? =
        getString(key = USER_NAME)

    fun getUserEmail(): String? =
        getString(key = USER_EMAIL)

    fun getUserLogin(): String? =
        getString(key = USER_LOGIN_VALUE)

    fun putUserAdres(value: String){
        putString(key = USER_ADRES, value = value)
    }

    fun putUserNumber(value: String){
        putString(key = USER_NUMBER, value = value)
    }

    fun putUserName(value: String){
        putString(key = USER_NAME, value = value)
    }

    fun putUserEmail(value: String){
        putString(key = USER_EMAIL, value = value)
    }

    fun putUserLogin(value: String){
        putString(key = USER_LOGIN_VALUE, value = value)
    }



    private fun getString(key: String): String? = appSharedPreference.getString(key, "empty")

    private fun putString(key: String, value: String?) =
        appSharedPreference.edit().putString(key, value).apply()
}