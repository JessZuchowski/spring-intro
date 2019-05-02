package com.lab11java401d3.songr.database;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue
    public long id;

    @OneToMany(mappedBy = "album")
    List<Song> songs;

    public String title;
    public String artist;
    public int songCount;
    public long length;
    public String imageURL;

}

