package com.example.pocspringcleanarch.application.response

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum
import java.time.LocalDateTime
import java.util.*

data class PlaylistResponseDTO(
    val id: UUID,
    val name: String,
    val status: PlaylistStatusEnum,
    val createdAt: LocalDateTime = LocalDateTime.now()
)