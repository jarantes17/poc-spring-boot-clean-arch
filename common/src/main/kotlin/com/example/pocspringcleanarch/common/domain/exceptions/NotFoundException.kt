package com.example.pocspringcleanarch.common.domain.exceptions

class NotFoundException(override var message: String, var errorRef: String) : RuntimeException(message)