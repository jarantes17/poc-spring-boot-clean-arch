package com.example.pocspringcleanarch.common.domain.exceptions

class AuthenticationException(override var message: String) : RuntimeException(message)