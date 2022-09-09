package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase

@UseCase
class GetOnePlaylistUseCase: RequestResponseUseCase<String, PlaylistResponse> {
    override fun execute(request: String): PlaylistResponse {
        TODO("Not yet implemented")
    }
}