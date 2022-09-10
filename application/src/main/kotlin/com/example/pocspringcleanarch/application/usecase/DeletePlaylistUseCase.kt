package com.example.pocspringcleanarch.application.usecase

import com.example.pocspringcleanarch.common.application.RequestUseCase
import com.example.pocspringcleanarch.common.domain.annotations.UseCase

@UseCase
class DeletePlaylistUseCase : RequestUseCase<String> {
    override fun execute(request: String) {
        TODO("Not yet implemented")
    }
}