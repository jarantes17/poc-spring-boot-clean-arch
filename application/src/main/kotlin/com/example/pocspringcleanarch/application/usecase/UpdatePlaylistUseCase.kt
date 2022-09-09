package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.request.CreatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase

@UseCase
class UpdatePlaylistUseCase: RequestResponseUseCase<CreatePlaylistRequest, PlaylistResponse> {
    override fun execute(request: CreatePlaylistRequest): PlaylistResponse {
        TODO("Not yet implemented")
    }
}