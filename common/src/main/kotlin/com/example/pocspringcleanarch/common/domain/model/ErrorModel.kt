package com.example.pocspringcleanarch.common.domain.model

class ErrorModel(
    val message: String,
    val errorRef: String,
    var timestamp: Long = System.currentTimeMillis()
)