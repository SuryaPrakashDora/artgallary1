/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.controller;

import com.example.artgallery.model.Artist;
import com.example.artgallery.model.Art;
import com.example.artgallery.model.Gallery;
import com.example.artgallery.service.ArtistJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    private ArtistJpaService artistJpaService;

    @GetMapping("/galleries/artists")
    public ArrayList<Artist> getArtists() {
        return artistJpaService.getArtists();
    }

    @GetMapping(" /galleries/artists/{artistId}")
    public Artist getArtistById(@PathVariable int artistId) {
        return artistJpaService.getArtistById(artistId);
    }

    @PostMapping("/galleries/artists")
    public Artist addArtist(@RequestBody Artist artist) {
        return artistJpaService.addArtist(artist);
    }

    @PutMapping("/galleries/artists/{artistId}")
    public Artist updateArtist(@PathVariable int artistId, @RequestBody Artist artist) {
        return artistJpaService.updateArtist(artistId, artist);
    }

    @DeleteMapping("/galleries/artists/{artistId}")
    public void deleteArtist(@PathVariable int artistId) {
        artistJpaService.deleteArtist(artistId);
    }

    @GetMapping("/artists/{artistId}/arts")
    public List<Art> getArtistArts(@PathVariable int artistId) {
        return artistJpaService.getArtistArts(artistId);
    }

    @GetMapping("/artists/{artistId}/galleries")
    public List<Gallery> getArtistGalleries(@PathVariable int artistId) {
        return artistJpaService.getArtistGalleries(artistId);
    }
}