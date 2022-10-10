package com.example.chat_application.routes

import com.example.chat_application.data.database.singupDB.Signup
import com.example.chat_application.models.User
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.litote.kmongo.newId

fun Route.signUpRoute(){
    val signup = Signup()
    route("/signup"){
        post {
            val userCredentials = call.receive<User>()
            val user = User(userCredentials.username,userCredentials.hashedPassword())
            signup.insert(user)
            call.respondText("User Created", status = HttpStatusCode.Created)
        }
    }
}