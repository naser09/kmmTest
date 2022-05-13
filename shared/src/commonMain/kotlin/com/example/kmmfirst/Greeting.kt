package com.example.kmmfirst

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}