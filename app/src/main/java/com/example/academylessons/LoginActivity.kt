package com.example.academylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.academylessons.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.enterButton.setOnClickListener {
            val loginText = binding.loginEditText.text.toString()
            val passwordText = binding.passwordEditText.text.toString()
            when {
                loginText.isEmpty() -> {
                    showToast("Заполните поле для ввода логина")
                }

                !loginText.contains("@gmail.com") -> {
                    showToast("Неправильный ввод логина")
                }

                passwordText.isEmpty() -> {
                    showToast("Заполните поле для ввода пароля")
                }

                passwordText.length <= 8 -> {
                    showToast("Пароль должен содержать не менее 8 символов")
                }


                else -> {
                    navigateToMusicListActivity()
                }
            }
        }




    }

    private fun navigateToMusicListActivity() {
        val intent = Intent(this, MusicListActivity::class.java)
        intent.addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK
                    or Intent.FLAG_ACTIVITY_CLEAR_TASK
        )
        startActivity(intent)

    }


    private fun showToast(message: String) {
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT
        ).show()

    }
}

