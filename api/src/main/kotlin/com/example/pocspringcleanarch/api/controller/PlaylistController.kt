package com.example.pocspringcleanarch.api.controller

import com.example.pocspringcleanarch.api.ApiApplication
import com.example.pocspringcleanarch.application.request.CreatePlaylistRequest
import com.example.pocspringcleanarch.application.request.UpdatePlaylistRequest
import com.example.pocspringcleanarch.application.response.PlaylistResponse
import com.example.pocspringcleanarch.application.usecase.*
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("${ApiApplication.V1}/playlists", produces = [MediaType.APPLICATION_JSON_VALUE])
@Tag(name = "Playlists")
class PlaylistController(
    private val getAllPlaylistUseCase: GetAllPlaylistUseCase,
    private val getOnePlaylistUseCase: GetOnePlaylistUseCase,
    private val createPlaylistUseCase: CreatePlaylistUseCase,
    private val updatePlaylistUseCase: UpdatePlaylistUseCase,
    private val deletePlaylistUseCase: DeletePlaylistUseCase
) {

    @Operation(description = "Endpoint to list all playlists")
    @ResponseBody
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "List of playlists was returned with success"),
        ]
    )
    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    fun index(pageable: Pageable) : ResponseEntity<Page<PlaylistResponse>> {
        return ResponseEntity.ok(getAllPlaylistUseCase.execute(pageable))
    }

    @Operation(description = "Endpoint to get a playlist by id")
    @ResponseBody
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Unique playlist was returned with success"),
            ApiResponse(responseCode = "404", description = "Playlist not found"),
        ]
    )
    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    fun detail(@PathVariable id: String): ResponseEntity<PlaylistResponse> {
        return ResponseEntity.ok(getOnePlaylistUseCase.execute(id))
    }

    @Operation(description = "Endpoint to create a new playlist")
    @ResponseBody
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "List of playlists was returned with success"),
        ]
    )
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    fun store(@RequestBody createPlaylistRequest: CreatePlaylistRequest, uriComponentsBuilder: UriComponentsBuilder): ResponseEntity<PlaylistResponse> {
        val createdPlaylist = createPlaylistUseCase.execute(createPlaylistRequest)
        val uriComponents = uriComponentsBuilder.path("/{id}").buildAndExpand(createdPlaylist.id)
        return ResponseEntity.created(uriComponents.toUri()).body(createdPlaylist)
    }

    @Operation(description = "Endpoint to update a playlist")
    @ResponseBody
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "List of playlists was returned with success"),
        ]
    )
    @PatchMapping
    @ResponseStatus(value = HttpStatus.OK)
    fun update(@RequestBody updatePlaylistRequest: UpdatePlaylistRequest): ResponseEntity<PlaylistResponse> {
        return ResponseEntity.ok(updatePlaylistUseCase.execute(updatePlaylistRequest))
    }

    @Operation(description = "Endpoint to delete a playlist by id")
    @ResponseBody
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "List of playlists was returned with success"),
            ApiResponse(responseCode = "404", description = "Playlist not found"),
        ]
    )
    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    fun destroy(@PathVariable id: String) {
        deletePlaylistUseCase.execute(id)
    }

}