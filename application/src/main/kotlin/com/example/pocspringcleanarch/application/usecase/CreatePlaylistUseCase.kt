package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.mapper.CreatePlaylistDomainMapper
import com.example.pocspringcleanarch.application.request.CreatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.domain.service.PlaylistService

@UseCase
class CreatePlaylistUseCase(
    private val playlistService: PlaylistService
) : RequestResponseUseCase<CreatePlaylistRequest, PlaylistResponse> {
    override fun execute(request: CreatePlaylistRequest): PlaylistResponse {
        return CreatePlaylistDomainMapper.mapFromDomainModel(
            playlistService.save(
                CreatePlaylistDomainMapper.mapToDomainModel(request)
            )
        )
    }
}