package com.example.pocspringcleanarch.infrastructure.service

import com.example.pocspringcleanarch.domain.constants.Exceptions
import com.example.pocspringcleanarch.domain.model.Playlist
import com.example.pocspringcleanarch.domain.service.PlaylistService
import org.springframework.stereotype.Service
import com.example.pocspringcleanarch.infrastructure.persistence.mapper.PlaylistEntityMapper
import com.example.pocspringcleanarch.infrastructure.persistence.repository.PlaylistRepository
import java.util.*

@Service
class PlaylistServiceImpl(
    private val playlistRepository: PlaylistRepository
) : PlaylistService {

    override fun findAll(): List<Playlist> {
        return playlistRepository.findAll()
            .map(PlaylistEntityMapper::mapFromEntity)
    }

    override fun findById(id: String): Playlist {
        return playlistRepository.findById(UUID.fromString(id))
            .map(PlaylistEntityMapper::mapFromEntity)
            .orElseThrow { Exceptions.PLAYLIST_NOT_FOUND }
    }


    override fun save(playlist: Playlist): Playlist {
        return PlaylistEntityMapper.mapFromEntity(
            playlistRepository.save(
                PlaylistEntityMapper.mapToEntity(playlist)
            )
        )
    }

    override fun update(playlist: Playlist): Playlist {
        return PlaylistEntityMapper.mapFromEntity(
            playlistRepository.save(
                PlaylistEntityMapper.mapToEntity(playlist)
            )
        )
    }

    override fun delete(id: String) {
        playlistRepository.findById(UUID.fromString(id))
            .flatMap {
                playlistRepository.delete(it)
                Optional.of(it)
            }.orElseThrow { Exceptions.PLAYLIST_NOT_FOUND }

    }

}