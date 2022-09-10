package com.example.pocspringcleanarch.common.domain.model

interface DomainMapper<Request, Response, Domain> {
    fun mapToDomainModel(obj: Request): Domain
    fun mapFromDomainModel(obj: Domain): Response
}