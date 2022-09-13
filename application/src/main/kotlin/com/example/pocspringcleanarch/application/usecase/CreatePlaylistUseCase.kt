package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.mapper.CreatePlaylistDTOMapper
import com.example.pocspringcleanarch.application.request.CreatePlaylistRequestDTO
import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.domain.service.PlaylistService

@UseCase
class CreatePlaylistUseCase(
    private val playlistService: PlaylistService
) : RequestResponseUseCase<CreatePlaylistRequestDTO, PlaylistResponseDTO> {

    override fun execute(request: CreatePlaylistRequestDTO): PlaylistResponseDTO {
        return CreatePlaylistDTOMapper.mapToDTO(
            playlistService.save(
                CreatePlaylistDTOMapper.mapFromDTO(request)
            )
        )
    }

}