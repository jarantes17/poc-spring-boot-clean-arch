package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.mapper.PlaylistDTOMapper
import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.domain.service.PlaylistService

@UseCase
class GetOnePlaylistUseCase(
    private val playlistService: PlaylistService
): RequestResponseUseCase<String, PlaylistResponseDTO> {

    override fun execute(request: String): PlaylistResponseDTO {
        return PlaylistDTOMapper.mapToDTO(playlistService.findById(request))
    }

}