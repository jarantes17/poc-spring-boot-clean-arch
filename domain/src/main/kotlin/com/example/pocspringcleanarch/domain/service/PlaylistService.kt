package com.example.pocspringcleanarch.domain.service

import com.example.pocspringcleanarch.domain.model.Playlist
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface PlaylistService {
    fun findAll(pageable: Pageable): Page<Playlist>
    fun findById(id: String): Playlist
    fun save(playlist: Playlist): Playlist
    fun update(playlist: Playlist): Playlist
    fun delete(id: String)
}