package com.example.pocspringcleanarch.application.request

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum

data class UpdatePlaylistRequestDTO(
    val id: String,
    val name: String,
    val status: PlaylistStatusEnum,
)