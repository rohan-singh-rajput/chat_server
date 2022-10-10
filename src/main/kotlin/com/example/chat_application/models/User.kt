package com.example.chat_application.models


import kotlinx.serialization.Serializable
import org.mindrot.jbcrypt.BCrypt

@Serializable
data class User(
    val username:String,
    val password:String
){
    fun hashedPassword():String =
        BCrypt.hashpw(password,BCrypt.gensalt())
}
