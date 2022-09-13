package com.example.pocspringcleanarch.infrastructure.persistence.entity

import com.example.pocspringcleanarch.domain.PlaylistStatusEnum
import org.hibernate.annotations.Type
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "playlists")
class PlaylistEntity(
    @Id
    @Type(type = "uuid-char")
    @Column(name = "id")
    val id: UUID,

    @Column(name="name")
    var name: String,

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    var status: PlaylistStatusEnum,

    @Column(name = "request_date")
    val createdAt: LocalDateTime,
) {

}