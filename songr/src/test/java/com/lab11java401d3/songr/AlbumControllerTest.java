package com.lab11java401d3.songr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AlbumControllerTest {

    @Autowired
    AlbumController bugController;

    @Test
    public void getAlbums() {
    }

    @Test
    public void addAlbum() {
    }
}