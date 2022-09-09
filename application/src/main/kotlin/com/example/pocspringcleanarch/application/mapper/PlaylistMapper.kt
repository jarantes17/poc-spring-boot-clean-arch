package com.example.pocspringcleanarch.application.mapper

import com.example.pocspringcleanarch.common.application.BaseMapper
import java.util.*

object PlaylistMapper : BaseMapper {

    override fun <CreateRequest, Domain> fromCreateRequestToDomain(createRequest: CreateRequest): Optional<Domain> {
        TODO("Not yet implemented")
    }

    override fun <UpdateRequest, Domain> fromUpdateRequestToDomain(updateRequest: UpdateRequest): Optional<Domain> {
        TODO("Not yet implemented")
    }

    override fun <Domain, Response> fromDomainToResponse(domain: Domain): Optional<Response> {
        TODO("Not yet implemented")
    }

    override fun <Domain, Entity> fromDomainToEntity(domain: Domain): Optional<Entity> {
        TODO("Not yet implemented")
    }

    override fun <Entity, Output> fromEntityToOutput(entity: Entity): Optional<Output> {
        TODO("Not yet implemented")
    }

    override fun <Output, Response> fromOutputToResponse(output: Output): Optional<Response> {
        TODO("Not yet implemented")
    }

}