package model

import data.enums.PlaylistStatusEnum
import java.time.LocalDateTime
import java.util.UUID

data class Playlist(
    val id: UUID,
    val name: String,
    val status: PlaylistStatusEnum,
    val createdAt: LocalDateTime
)
