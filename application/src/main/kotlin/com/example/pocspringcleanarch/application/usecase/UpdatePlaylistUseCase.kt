package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.mapper.UpdatePlaylistDTOMapper
import com.example.pocspringcleanarch.application.request.UpdatePlaylistRequestDTO
import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.domain.service.PlaylistService

@UseCase
class UpdatePlaylistUseCase(
    private val playlistService: PlaylistService
) : RequestResponseUseCase<UpdatePlaylistRequestDTO, PlaylistResponseDTO> {

    override fun execute(request: UpdatePlaylistRequestDTO): PlaylistResponseDTO {
        return UpdatePlaylistDTOMapper.mapToDTO(
            playlistService.update(
                UpdatePlaylistDTOMapper.mapFromDTO(request)
            )
        )
    }

}