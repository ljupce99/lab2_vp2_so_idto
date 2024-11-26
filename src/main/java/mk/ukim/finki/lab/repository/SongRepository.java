package mk.ukim.finki.lab.repository;

import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class SongRepository {
    public List<Song> listaS=new ArrayList<>();
    private final AlbumRepository albumRepository;

    public SongRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
        listaS.add(new Song( "T001", "Billie Jean", "Pop", 1982));
        listaS.add(new Song( "T002", "Hells Bells", "Rock", 1980));
        listaS.add(new Song( "T003", "Money", "Progressive Rock", 1973));
        listaS.add(new Song( "T004", "Dreams", "Soft Rock", 1977));
        listaS.add(new Song( "T005", "Come Together", "Rock", 1969));

    }
    public void save(Song song){

        listaS.add(song);
    }

    public List<Song> findAll(){
        return listaS;
    }
    public Song findByTrackId(String trackId){
        return listaS.stream().filter(s->s.getTrackId().equals(trackId)).findFirst().orElse(null);
    }
    public Artist addArtistToSong(Artist artist, Song song){
        listaS.stream().filter(i->i.getTrackId().equals(song.getTrackId())).findFirst().get().addPerformer(artist);
        return artist;
    }
    public String delete( Long id){
        Song song=listaS.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if(song!=null){
            listaS.remove(song);
        }
        return "";
    }
    public Song findById(Long Id){
        return listaS.stream().filter(s -> s.getId().equals(Id)).findFirst().orElse(null);
    }


}
