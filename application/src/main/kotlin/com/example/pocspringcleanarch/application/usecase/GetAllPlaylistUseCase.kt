package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.common.application.RequestResponseUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase
import com.example.pocspringcleanarch.common.domain.utils.PageParams
import org.springframework.data.domain.Page

@UseCase
class GetAllPlaylistUseCase : RequestResponseUseCase<PageParams, Page<PlaylistResponse>> {
    override fun execute(request: PageParams): Page<PlaylistResponse> {
        TODO("Not yet implemented")
    }
}