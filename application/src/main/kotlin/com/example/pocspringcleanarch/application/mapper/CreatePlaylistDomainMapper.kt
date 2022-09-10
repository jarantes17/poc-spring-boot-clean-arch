package com.example.pocspringcleanarch.application.mapper

import com.example.pocspringcleanarch.application.request.CreatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.domain.model.DomainMapper
import com.example.pocspringcleanarch.domain.model.Playlist

object CreatePlaylistDomainMapper : DomainMapper<CreatePlaylistRequest, PlaylistResponse, Playlist> {
    override fun mapToDomainModel(obj: CreatePlaylistRequest): Playlist {
        return with(obj) {
            Playlist(
                name = name,
                status = status
            )
        }
    }

    override fun mapFromDomainModel(obj: Playlist): PlaylistResponse {
        return with(obj) {
            PlaylistResponse(
                id = id!!,
                name = name,
                status = status,
                createdAt = createdAt
            )
        }
    }


}