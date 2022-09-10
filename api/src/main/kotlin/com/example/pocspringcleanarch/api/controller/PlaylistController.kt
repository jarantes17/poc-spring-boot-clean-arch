package com.example.pocspringcleanarch.api.controller

import com.example.pocspringcleanarch.application.request.CreatePlaylistRequest
import com.example.pocspringcleanarch.application.request.UpdatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.application.usecase.*
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/playlists")
class PlaylistController(
    private val getAllPlaylistUseCase: GetAllPlaylistUseCase,
    private val getOnePlaylistUseCase: GetOnePlaylistUseCase,
    private val createPlaylistUseCase: CreatePlaylistUseCase,
    private val updatePlaylistUseCase: UpdatePlaylistUseCase,
    private val deletePlaylistUseCase: DeletePlaylistUseCase
) {

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    fun index(pageable: Pageable) : ResponseEntity<Page<PlaylistResponse>> {
        return ResponseEntity.ok(getAllPlaylistUseCase.execute(pageable))
    }

    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    fun detail(@PathVariable id: String): ResponseEntity<PlaylistResponse> {
        return ResponseEntity.ok(getOnePlaylistUseCase.execute(id))
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    fun store(@RequestBody createPlaylistRequest: CreatePlaylistRequest, uriComponentsBuilder: UriComponentsBuilder): ResponseEntity<PlaylistResponse> {
        val createdPlaylist = createPlaylistUseCase.execute(createPlaylistRequest)
        val uriComponents = uriComponentsBuilder.path("/{id}").buildAndExpand(createdPlaylist.id)
        return ResponseEntity.created(uriComponents.toUri()).body(createdPlaylist)
    }

    @PatchMapping
    @ResponseStatus(value = HttpStatus.OK)
    fun update(@RequestBody updatePlaylistRequest: UpdatePlaylistRequest): ResponseEntity<PlaylistResponse> {
        return ResponseEntity.ok(updatePlaylistUseCase.execute(updatePlaylistRequest))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    fun destroy(@PathVariable id: String) {
        deletePlaylistUseCase.execute(id)
    }

}