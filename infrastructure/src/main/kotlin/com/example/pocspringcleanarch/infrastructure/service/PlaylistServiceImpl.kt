package com.example.pocspringcleanarch.infrastructure.service

import com.example.pocspringcleanarch.domain.constants.Exceptions
import com.example.pocspringcleanarch.domain.model.Playlist
import com.example.pocspringcleanarch.domain.service.PlaylistService
import org.springframework.stereotype.Service
import com.example.pocspringcleanarch.infrastructure.persistence.mapper.PlaylistEntityMapper
import com.example.pocspringcleanarch.infrastructure.persistence.repository.PlaylistRepository
import org.springframework.beans.BeanUtils
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class PlaylistServiceImpl(
    private val playlistRepository: PlaylistRepository
) : PlaylistService {

    override fun findAll(pageable: Pageable): Page<Playlist> {
        return playlistRepository.findAll(pageable)
            .map(PlaylistEntityMapper::mapFromEntity)
    }

    override fun findById(id: String): Playlist {
        return playlistRepository.findById(UUID.fromString(id))
            .map(PlaylistEntityMapper::mapFromEntity)
            .orElseThrow { Exceptions.PLAYLIST_NOT_FOUND }
    }


    @Transactional
    override fun save(playlist: Playlist): Playlist {
        return PlaylistEntityMapper.mapFromEntity(
            playlistRepository.save(
                PlaylistEntityMapper.mapToEntity(playlist)
            )
        )
    }

    @Transactional
    override fun update(playlist: Playlist): Playlist {
        this.findById(playlist.id.toString())

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