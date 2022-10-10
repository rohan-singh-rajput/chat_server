package com.example.chat_application.data.database.singupDB


import com.example.chat_application.models.User
import kotlinx.coroutines.runBlocking
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection


class Signup {
     val client = KMongo.createClient("mongodb+srv://rohan:Bidar%40123@cluster0.vjxnwem.mongodb.net/test")
     val database  = client.getDatabase("signupDB")
    val userColumn = database.getCollection<User>()

    fun insert(user:User){
        runBlocking {
            userColumn.insertOne(user)
        }
    }
}