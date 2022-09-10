package com.example.pocspringcleanarch.domain.model

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum
import java.time.LocalDateTime
import java.util.UUID

data class Playlist(
    var id: UUID? = null,
    val name: String,
    val status: PlaylistStatusEnum,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
