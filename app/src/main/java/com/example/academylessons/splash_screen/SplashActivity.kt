package com.example.academylessons.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylessons.MusicListActivity
import com.example.academylessons.R
import com.example.academylessons.SignActivity
import com.example.academylessons.models.User

class SplashActivity : AppCompatActivity() {

    private val userCashe: UserCasheManager by lazy {
        UserCasheManager(this)
    }


    private val user: User by lazy {
        userCashe.getUser() ?: User.unknown()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = if (user.isAuth){
            Intent(this, MusicListActivity::class.java )
        } else {
            Intent(this, SignActivity::class.java)
        }
        startActivity(intent)

        }

    }
