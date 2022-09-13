package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.mapper.PlaylistDTOMapper
import com.example.pocspringcleanarch.application.response.PlaylistResponseDTO
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.domain.service.PlaylistService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

@UseCase
class GetAllPlaylistUseCase(
    private val playlistService: PlaylistService
) : RequestResponseUseCase<Pageable, Page<PlaylistResponseDTO>> {

    override fun execute(request: Pageable): Page<PlaylistResponseDTO> {
        return playlistService.findAll(request).map(PlaylistDTOMapper::mapToDTO)
    }

}