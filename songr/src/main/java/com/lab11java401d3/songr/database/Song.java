package com.lab11java401d3.songr.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {

    @Id
    @GeneratedValue
    public long id;

    public String title;
    public long length;
    public int trackNumber;
    public String albumTitle;

    @ManyToOne
    public Album album;

    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String setTitle() {
        return title;
    }
    public void getTitle(String title) {
        this.title = title;
    }

    public long getLength() {
        return this.length;
    }
    public void setLength(long length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }
    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }
}
