package com.example.pocspringcleanarch.domain.service

import com.example.pocspringcleanarch.domain.model.Playlist

interface PlaylistService {
    fun findAll(): List<Playlist>
    fun findById(id: String): Playlist
    fun save(playlist: Playlist): Playlist
    fun update(playlist: Playlist): Playlist
    fun delete(id: String)
}