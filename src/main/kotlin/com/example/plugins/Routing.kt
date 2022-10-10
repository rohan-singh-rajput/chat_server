package com.example.plugins

import com.example.chat_application.routes.signUpRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*


fun Application.configureRouting() {
    routing {
        signUpRoute()
    }
}
