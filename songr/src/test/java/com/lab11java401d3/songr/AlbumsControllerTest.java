package com.lab11java401d3.songr;

import com.lab11java401d3.songr.controllers.AlbumsController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class AlbumsControllerTest {

    @Autowired
    AlbumsController SongsController;

    @Test
    public void getAlbums() {
    }

    @Test
    public void addAlbum() {
    }
}