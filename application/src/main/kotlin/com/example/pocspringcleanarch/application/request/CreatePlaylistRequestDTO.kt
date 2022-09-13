package com.example.pocspringcleanarch.application.request

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum

data class CreatePlaylistRequestDTO(
    val name: String,
    val status: PlaylistStatusEnum,
)