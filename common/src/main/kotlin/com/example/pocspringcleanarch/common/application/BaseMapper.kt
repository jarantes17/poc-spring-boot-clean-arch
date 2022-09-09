package com.example.pocspringcleanarch.common.application

import java.util.Optional

interface BaseMapper {
    fun <CreateRequest, Domain> fromCreateRequestToDomain(createRequest: CreateRequest): Optional<Domain>
    fun <UpdateRequest, Domain> fromUpdateRequestToDomain(updateRequest: UpdateRequest): Optional<Domain>
    fun <Domain, Response> fromDomainToResponse(domain: Domain): Optional<Response>
    fun <Domain, Entity> fromDomainToEntity(domain: Domain): Optional<Entity>
    fun <Entity, Output> fromEntityToOutput(entity: Entity): Optional<Output>
    fun <Output, Response> fromOutputToResponse(output: Output): Optional<Response>
}