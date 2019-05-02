package com.lab11java401d3.songr.controllers;

import com.lab11java401d3.songr.SongNotFoundException;
import com.lab11java401d3.songr.database.Song;
import com.lab11java401d3.songr.database.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/songs")
public class SongsController {

    @Autowired
    SongRepository songRepo;

    @GetMapping("/song/{id}")
    public Song getSong(
            @PathVariable Long id
    ) {
        Optional<Song>  song = this.songRepo.findById(id);
        if (song.isPresent()) {
            return song.get();
        } else {
            throw new SongNotFoundException();
        }
    }

    @PostMapping("/song")
    public Song addSong(
            @RequestBody Song song
    ) {
        song = this.songRepo.save(song);
        return song;
    }

    @PutMapping("/song/{id}")
    public Song editSong(
            @PathVariable Long id,
            @RequestBody Song song
    ) {
        Optional<Song> repoSong = this.songRepo.findById(id);
        if (repoSong.isPresent()) {
            Song foundSong = repoSong.get();

            foundSong.title = song.title;
            foundSong.length = song.length;
            foundSong.trackNumber = song.trackNumber;
            foundSong.albumTitle = song.albumTitle;

            foundSong = this.songRepo.save(foundSong);
            return foundSong;
        }
        throw new SongNotFoundException();
    }

    @DeleteMapping("/song/{id}")
    public void deleteSong(
            @PathVariable Long id
    ) {
        this.songRepo.deleteById(id);
    }
}
