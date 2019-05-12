package com.lab11java401d3.songr.controllers;


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

@Controller
@RequestMapping("/albums")
public class AlbumsController {

    @Autowired
    AlbumRepository albumRepo;

    @Autowired
    SongRepository songRepo;

    @GetMapping
    public String getAlbums(Model model) {
        List<Album> albums = this.albumRepo.findAll();

        model.addAttribute("albums", albums);

        return "albums";

    }



    @PostMapping("/add")
    public RedirectView addAlbum(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int songCount,
            @RequestParam int length,
            @RequestParam String imageURL
    ) {
        Album album = new Album();
        album.title = title;
        album.artist = artist;
        album.songCount = songCount;
        album.length = length;
        album.imageURL = imageURL;

        album = albumRepo.save(album);
        return new RedirectView("/");
    }
}

