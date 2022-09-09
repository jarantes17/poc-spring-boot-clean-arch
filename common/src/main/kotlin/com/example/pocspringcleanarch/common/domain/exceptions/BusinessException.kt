package com.example.pocspringcleanarch.common.domain.exceptions

class BusinessException(override var message: String) : RuntimeException(message)