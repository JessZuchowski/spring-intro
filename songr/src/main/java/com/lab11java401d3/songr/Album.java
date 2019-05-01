package com.lab11java401d3.songr;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

}

//title, artist, songCount, length(seconds), imageURL
//user should be able to see information about albums on site and add albums
