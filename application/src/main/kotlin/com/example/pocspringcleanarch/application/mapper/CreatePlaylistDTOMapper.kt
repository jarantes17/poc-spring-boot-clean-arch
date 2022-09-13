package com.example.pocspringcleanarch.application.mapper

import com.example.pocspringcleanarch.application.request.CreatePlaylistRequestDTO
import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.domain.model.RequestResponseDTOMapper
import com.example.pocspringcleanarch.domain.model.Playlist

object CreatePlaylistDTOMapper : RequestResponseDTOMapper<CreatePlaylistRequestDTO, PlaylistResponseDTO, Playlist> {

    override fun mapFromDTO(obj: CreatePlaylistRequestDTO): Playlist {
        return with(obj) {
            Playlist(
                name = name,
                status = status
            )
        }
    }

    override fun mapToDTO(obj: Playlist): PlaylistResponseDTO {
        return with(obj) {
            PlaylistResponseDTO(
                id = id!!,
                name = name,
                status = status,
                createdAt = createdAt
            )
        }
    }

}