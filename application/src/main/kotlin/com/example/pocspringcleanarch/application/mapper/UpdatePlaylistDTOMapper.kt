package com.example.pocspringcleanarch.application.mapper

import com.example.pocspringcleanarch.application.request.UpdatePlaylistRequestDTO
import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.domain.model.RequestResponseDTOMapper
import com.example.pocspringcleanarch.domain.model.Playlist
import java.util.*

object UpdatePlaylistDTOMapper : RequestResponseDTOMapper<UpdatePlaylistRequestDTO, PlaylistResponseDTO, Playlist> {

    override fun mapFromDTO(obj: UpdatePlaylistRequestDTO): Playlist {
        return with(obj) {
            Playlist(
                id = UUID.fromString(id),
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