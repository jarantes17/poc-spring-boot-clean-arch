package com.example.pocspringcleanarch.application.mapper

import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.domain.model.DTOMapper
import com.example.pocspringcleanarch.domain.model.Playlist

object PlaylistDTOMapper : DTOMapper<PlaylistResponseDTO, Playlist>  {

    override fun mapFromDTO(obj: PlaylistResponseDTO): Playlist {
        return with(obj) {
            Playlist(
                id = id,
                name = name,
                status = status,
                createdAt = createdAt
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