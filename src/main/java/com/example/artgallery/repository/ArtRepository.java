/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.repository;

import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;
import java.util.ArrayList;
import java.util.List;

public interface ArtRepository {
    ArrayList<Art> getArts();

    Art getArtsById(int artId);

    Art addArt(Art art);

    Art updateArt(int artId, Art art);

    void deleteArt(int artId);

    Artist getArtArtists(int artId);
}