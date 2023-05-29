package com.example.academylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.academylessons.databinding.ActivityLoginBinding
import com.example.academylessons.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySignBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.loginBtn.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.createAccountButton.setOnClickListener {
            val firstNameText = binding.fnEditText.text.toString()
            val lastNameText = binding.lnEditText.text.toString()
            val emailText = binding.emEditText.text.toString()
            val passwordSignText = binding.pwEditText.text.toString()


            when {
                firstNameText.isEmpty() || firstNameText.length < 7 -> {
                    showToast("Заполните поле для ввода имени")
                }

                lastNameText.isEmpty() || lastNameText.length < 7 -> {
                    showToast("Заполните поле для ввода фамилии")
                }

                emailText.isEmpty() || !emailText.contains("@gmail.com") -> {
                    showToast("Неправильный ввод почты")
                }

                passwordSignText.isEmpty() || passwordSignText.length <= 8 -> {
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