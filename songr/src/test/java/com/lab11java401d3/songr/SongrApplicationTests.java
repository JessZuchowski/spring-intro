package com.lab11java401d3.songr;

import com.lab11java401d3.songr.controllers.AlbumsController;
import com.lab11java401d3.songr.controllers.BonusAlbumsController;
import com.lab11java401d3.songr.controllers.SongsController;
import com.lab11java401d3.songr.database.Album;
import com.lab11java401d3.songr.database.AlbumRepository;
import com.lab11java401d3.songr.database.Song;
import com.lab11java401d3.songr.database.SongRepository;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongrApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	AlbumsController albumsController;

	@Autowired
	SongsController songsController;

	@Autowired
	BonusAlbumsController bonusAlbumsController;

	@Autowired
	AlbumRepository repoA;

	@Autowired
	SongRepository repoS;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

//	@Test
//	public void testAlbumsController() {
//		List<Song> songs = (List<Song>) songsController.getSongs();
//		assertEquals(1, songs.size());
//	}

//	@Test
//	public void testGetSongs() throws Exception {
//		Song song1 = new Song();
//		song1.title = "Testing 1";
//		repoS.save(song1);
//
//		Song song2 = new Song();
//		song2.title = "Testing 2";
//		repoS.save(song2);
//
//		mockMvc.perform(MockMvcRequestBuilders.get("/bonusAlbum"))
//				.andExpect(content().string(Matchers.containsString("Testing 1")))
//	}

//	@Test
//	public void contextLoads() {
//	}

}
