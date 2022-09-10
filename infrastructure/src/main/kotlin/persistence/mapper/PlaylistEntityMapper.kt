package persistence.mapper

import com.example.pocspringcleanarch.common.infrastructure.persistence.EntityMapper
import com.example.pocspringcleanarch.domain.model.Playlist
import persistence.entity.PlaylistEntity
import java.time.LocalDateTime
import java.util.UUID

object PlaylistEntityMapper : EntityMapper<Playlist, PlaylistEntity> {
    override fun mapToEntity(obj: Playlist): PlaylistEntity {
        return with(obj) {
            PlaylistEntity(
                id = id ?: UUID.randomUUID(),
                name = name,
                status = status,
                createdAt = LocalDateTime.now()
            )
        }
    }

    override fun mapFromEntity(obj: PlaylistEntity): Playlist {
        return with(obj) {
            Playlist(
                id = id,
                name = name,
                status = status,
                createdAt = createdAt
            )
        }
    }
}