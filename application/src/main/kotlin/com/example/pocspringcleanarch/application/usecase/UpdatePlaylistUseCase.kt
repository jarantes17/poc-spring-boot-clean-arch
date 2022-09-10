package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.request.CreatePlaylistRequest
import com.example.pocspringcleanarch.application.request.UpdatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase

@UseCase
class UpdatePlaylistUseCase: RequestResponseUseCase<UpdatePlaylistRequest, PlaylistResponse> {
    override fun execute(request: UpdatePlaylistRequest): PlaylistResponse {
        TODO("Not yet implemented")
    }
}