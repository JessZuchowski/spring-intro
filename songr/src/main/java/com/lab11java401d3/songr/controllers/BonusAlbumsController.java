package com.lab11java401d3.songr.controllers;


import com.lab11java401d3.songr.SongNotFoundException;
import com.lab11java401d3.songr.database.Album;
import com.lab11java401d3.songr.database.AlbumRepository;
import com.lab11java401d3.songr.database.Song;
import com.lab11java401d3.songr.database.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/bonusAlbums")
public class BonusAlbumsController {

    @Autowired
    SongRepository songRepo;

    @Autowired
    AlbumRepository albumRepo;

    @GetMapping
    public String getSongs(Model model) {
        List<Song> songs = songRepo.findAll();
        List<Album> albums = albumRepo.findAll();

        model.addAttribute("songs", songs);
        model.addAttribute("albums", albums);

        return "songs";
    }

    @PostMapping("/add")
    public RedirectView addAlbum(
            @RequestParam String title,
            @RequestParam int length,
            @RequestParam int trackNumber,
            @RequestParam String albumTitle
    ) {
        Song song = new Song();
        song.title = title;
        song.length = length;
        song.trackNumber = trackNumber;
        song.albumTitle = albumTitle;

        song = songRepo.save(song);

        return new RedirectView("/bonusAlbum");
    }

    @GetMapping("/song/{id}")
    public String getSong(
            @PathVariable Long id,
            Model model
    ) {

        Optional<Song> foundSong = songRepo.findById(id);

        if (foundSong.isPresent()) {
            List<Album> albums = albumRepo.findAll();
            model.addAttribute("albums", albums);
            model.addAttribute("song", foundSong.get());
            return "song";
        }
        throw new SongNotFoundException();
    }
        @PostMapping("/edit")
                public RedirectView editSong(
                        @RequestParam Long id,
                 @RequestParam String title,
                 @RequestParam long length,
                 @RequestParam int trackNumber,
                 @RequestParam String albumTitle,
                        @RequestParam long album
                ) {

        Optional<Song> foundSong = songRepo.findById(id);

        Optional<Album> foundAlbum = albumRepo.findById(album);

        if (foundSong.isPresent() && foundAlbum.isPresent()) {
            Song song = foundSong.get();
            Album albumN = foundAlbum.get();
            song.title = title;
            song.length = length;
            song.trackNumber = trackNumber;
            song.albumTitle = albumTitle;

            song.album = albumN;

            song = songRepo.save(song);
        } else {
            throw new SongNotFoundException();
        }
        return new RedirectView("/bonusAlbum");

        }
}
