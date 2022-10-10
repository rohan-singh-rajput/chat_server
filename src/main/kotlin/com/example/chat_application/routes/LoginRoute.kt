package com.example.chat_application.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.loginRoute(){
    route("/login"){
        get {
            call.respond("Login Page Found")
        }
    }
}