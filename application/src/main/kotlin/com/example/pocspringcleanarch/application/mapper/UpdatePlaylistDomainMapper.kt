package com.example.pocspringcleanarch.application.mapper

import com.example.pocspringcleanarch.application.request.UpdatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.domain.model.DomainMapper
import com.example.pocspringcleanarch.domain.model.Playlist
import java.util.*

object UpdatePlaylistDomainMapper : DomainMapper<UpdatePlaylistRequest, PlaylistResponse, Playlist> {
    override fun mapToDomainModel(obj: UpdatePlaylistRequest): Playlist {
        return with(obj) {
            Playlist(
                id = UUID.fromString(id),
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