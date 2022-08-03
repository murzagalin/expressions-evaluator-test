package com.github.murzagalin.etest

import com.github.murzagalin.evaluator.Evaluator

class Expression {
    fun calculate(): String {
        return "2 + 2 = ${Evaluator().evaluateDouble("2 + 2")}"
    }
}