package com.example.pocspringcleanarch.application.request

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum

data class UpdatePlaylistRequest(
    val id: String,
    val name: String,
    val status: PlaylistStatusEnum,
)