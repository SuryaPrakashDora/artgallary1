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

import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;
import com.example.artgallery.service.ArtJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArtController {
    @Autowired 
    private ArtJpaService artJpaService;
    @GetMapping("/galleries/artists/arts")
    public ArrayList<Art> getArts() {
        return artJpaService.getArts();
    }
    @GetMapping("/galleries/artists/arts/{artId}")
    public Art getArtsById(@PathVariable int artId) {
        return artJpaService.getArtsById(artId);
    }
    @PostMapping("/galleries/artists/arts")
    public Art addArt(Art art) {
        return artJpaService.addArt(art);
    }
    @PutMapping("/galleries/artists/arts/{artId}")
    public Art updateArt(int artId, Art art) {
        return artJpaService.updateArt(artId, art);
    }
    @DeleteMapping("/galleries/artists/arts/{artId}")
    public void deleteArt(int artId) {
        artJpaService.deleteArt(artId);
    }
    @GetMapping("/arts/{artId}/artist")
    public Artist getArtArtists(int artId) {
        return artJpaService.getArtArtists(artId);
    }
}