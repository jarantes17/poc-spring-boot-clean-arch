package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

@UseCase
class GetAllPlaylistUseCase : RequestResponseUseCase<Pageable, Page<PlaylistResponse>> {
    override fun execute(request: Pageable): Page<PlaylistResponse> {
        TODO("Not yet implemented")
    }
}