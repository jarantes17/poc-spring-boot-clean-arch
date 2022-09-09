package com.example.pocspringcleanarch.common.application

interface RequestResponseUseCase<Request, Response> {
    fun execute(request: Request) : Response
}

interface RequestUseCase<Request> {
    fun execute(request: Request)
}

interface ResponseUseCase<Response> {
    fun execute() : Response
}

interface AvoidUseCase {
    fun execute()
}