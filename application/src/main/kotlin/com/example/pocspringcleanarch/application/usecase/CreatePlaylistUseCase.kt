package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase

@UseCase
class CreatePlaylistUseCase: RequestResponseUseCase<CreatePlaylistUseCase, PlaylistResponse> {
    override fun execute(request: CreatePlaylistUseCase): PlaylistResponse {
        TODO("Not yet implemented")
    }
}