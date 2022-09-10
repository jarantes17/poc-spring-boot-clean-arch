package com.example.pocspringcleanarch.application.request

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum

data class CreatePlaylistRequest(
    val name: String,
    val status: PlaylistStatusEnum,
)