package com.lab11java401d3.songr.database;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue
    public long id;

    public String title;
    public String artist;
    public int songCount;
    public long length;
    public String imageURL;

    @OneToMany(mappedBy = "album")
    public List<Song> songs;

    public Album() {
        songs = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return this.songCount;
    }
    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public long getLength() {
        return this.length;
    }
    public void setLength(long length) {
        this.length = length;
    }

    public String getImageURL() {
        return this.imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}

