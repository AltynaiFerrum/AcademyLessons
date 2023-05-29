package com.example.academylessons.splash_screen

import android.annotation.SuppressLint
import android.content.Context
import com.example.academylessons.models.User
import com.google.gson.Gson

private const val USER_SHARED_PREF_KEY = "USER_SHARED_PREF_KEY"
private const val USER_PREF_KEY = "USER_PREF_KEY"

class UserCasheManager (
    private val context: Context
        ) {
    private val sharedPreferences = context.getSharedPreferences(
        USER_SHARED_PREF_KEY,
        Context.MODE_PRIVATE
    )

    fun getUser(): User? {
       val userString = sharedPreferences.getString(
            USER_PREF_KEY, null

        )
        val user = Gson().fromJson(userString,User::class.java)?: null
        return user
    }

    @SuppressLint("SuspiciousIndentation")
    fun saveNewUser(user: User) {
    val userGsonString = Gson().toJson(user)
        sharedPreferences
            .edit()
            .putString(USER_PREF_KEY,userGsonString )
            .apply()
    }

    fun removeCurrentUser() {
        sharedPreferences
            .edit()
            .clear()
            .apply()
    }
}
