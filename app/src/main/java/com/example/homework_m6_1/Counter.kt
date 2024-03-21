package com.example.homework_m6_1

class Counter(private var value: Int = 99) {
    fun getValue(): Int {
        return value
    }

    fun inc() {
        value++
    }

    fun dec() {
        value--
    }
}
