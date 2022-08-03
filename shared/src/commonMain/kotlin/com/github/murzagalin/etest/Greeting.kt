package com.github.murzagalin.etest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}