package persistence.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import persistence.entity.PlaylistEntity
import java.util.UUID

@Repository
interface PlaylistRepository : JpaRepository<PlaylistEntity, UUID> {
}