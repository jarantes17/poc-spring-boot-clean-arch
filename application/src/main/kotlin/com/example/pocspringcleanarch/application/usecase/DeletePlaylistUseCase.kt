package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.common.application.RequestUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.domain.service.PlaylistService

@UseCase
class DeletePlaylistUseCase(
    private val playlistService: PlaylistService
) : RequestUseCase<String> {

    override fun execute(request: String) {
        playlistService.delete(request)
    }

}