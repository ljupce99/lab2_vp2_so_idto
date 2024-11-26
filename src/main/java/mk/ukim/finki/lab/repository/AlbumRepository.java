package mk.ukim.finki.lab.repository;

import mk.ukim.finki.lab.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class AlbumRepository {
    public AlbumRepository() {
        this.albums.add( new Album( "Thriller", "Pop", "1982"));
        this.albums.add( new Album("Back in Black", "Rock", "1980"));
        this.albums.add( new Album( "The Dark Side of the Moon", "Progressive Rock", "1973"));
        this.albums.add( new Album( "Rumours", "Soft Rock", "1977"));
        this.albums.add( new Album("Abbey Road", "Rock", "1969"));
    }

    private List<Album> albums=new ArrayList<>();

    public List<Album> findAll(){
        return albums;
    }
    public Album findById(Long id){
        return albums.stream().filter(album -> album.getId().equals(id)).findFirst().orElse(null);
    }
}
