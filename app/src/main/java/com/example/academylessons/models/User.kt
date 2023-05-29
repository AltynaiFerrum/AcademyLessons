package com.example.academylessons.models

data class User (
    val name: String,
    val LastName: String,
    val email: String,
    val password: String,
    val isAuth: Boolean

        ) {

    companion object{
        fun unknown () = User (
            name = String(),
            LastName = String(),
            email = String(),
            password = String(),
            isAuth = false
                )
    }
}
