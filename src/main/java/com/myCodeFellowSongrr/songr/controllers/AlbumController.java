package com.myCodeFellowSongrr.songr.controllers;

import com.myCodeFellowSongrr.songr.model.Album;
import com.myCodeFellowSongrr.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album")
    public String albumModel(Model m) throws MalformedURLException {
        Album midnights = new Album("Midnight","Taylor Swift", 20, 2641, "https://en.wikipedia.org/wiki/Midnights#/media/File:Midnights_-_Taylor_Swift.png");
        Album channelOrange = new Album("Channel Orange", "Frank Ocean", 18, 3730, "https://en.wikipedia.org/wiki/Channel_Orange#/media/File:Channel_ORANGE.jpg");
        Album dreamLand = new Album("Dreamland", "Glass Animals", 16, 2710, "https://en.wikipedia.org/wiki/Dreamland_(Glass_Animals_album)#/media/File:Dreamland_(Glass_Animals).png");
        Album[] albums = {midnights, channelOrange, dreamLand};
        m.addAttribute("midnights", midnights.toString());
        m.addAttribute("channelOrange", channelOrange.toString());
        m.addAttribute("dreamLand", dreamLand.toString());
        return "albums";
    }

    @GetMapping("/albums")
    public String getAlbums(Model m){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums-store";
    }

    @PostMapping("/albums")
    public RedirectView createNewAlbum(String title, String artist, int songCount, int lengthInSeconds, String imageURL){
        Album newAlbum = new Album(title, artist, songCount, lengthInSeconds, imageURL);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
}
