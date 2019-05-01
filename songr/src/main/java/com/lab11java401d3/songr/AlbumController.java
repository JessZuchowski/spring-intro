package com.lab11java401d3.songr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    AlbumRepository repo;

    @GetMapping("/")
    public Iterable<Album> getAlbums() {
        Album album = new Album();
        album.title = "Test Title";
        album.artist = "Test Artist";
        album.songCount = 11;
        album.length = 120;
        album.imageURL = "test/image/url";

        this.repo.save(album);

        Iterable<Album> albums = this.repo.findAll();

        return albums;
    }

    @PostMapping("/album")
    public Album addAlbum(
            @RequestBody Album album
    ) {
        album = this.repo.save(album);

        return album;
    }
}

