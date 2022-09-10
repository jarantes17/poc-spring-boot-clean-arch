package com.example.pocspringcleanarch.domain.constants

import com.example.pocspringcleanarch.common.domain.exceptions.NotFoundException

object Exceptions {
    val PLAYLIST_NOT_FOUND = NotFoundException("Playlist not found on database", "PLAYLIST_NOT_FOUND")
}