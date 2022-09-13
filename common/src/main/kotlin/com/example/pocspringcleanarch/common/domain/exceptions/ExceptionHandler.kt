package com.example.pocspringcleanarch.common.domain.exceptions

import com.example.pocspringcleanarch.common.domain.model.ErrorModel
import org.springframework.core.annotation.Order
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@Order(-1)
@ControllerAdvice
class ExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(value = [NotFoundException::class])
    protected fun handleNotFound(ex: NotFoundException, request: WebRequest): ResponseEntity<Any?>? {
        val status = HttpStatus.NOT_FOUND

        val body = ErrorModel(
            message = ex.message,
            errorRef = ex.errorRef
        )

        return handleExceptionInternal(ex, body, HttpHeaders(), status, request)
    }

}