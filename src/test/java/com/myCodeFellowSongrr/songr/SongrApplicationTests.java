package com.myCodeFellowSongrr.songr;

import com.myCodeFellowSongrr.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createAlbum(){
		Album sut = new Album("Painfully Average", "Tom",10, 2133, "fake link");
		assertNotNull(sut);
	}

	@Test void checkToString(){
		Album sut = new Album("Painfully Average", "Tom",10, 2133, "fake link");
		assertEquals(sut.toString(), "Painfully Average is by Tom and contains 10 songs");
	}

	@Test void getters(){
		Album sut = new Album("Painfully Average", "Tom",10, 2133, "fake link");
		assertEquals(sut.getArtist(), "Tom");
		assertEquals(sut.getTitle(), "Painfully Average");
		assertEquals(sut.getImageURL(), "fake link");
		assertEquals(sut.getSongCount(), 10);
	}

}
