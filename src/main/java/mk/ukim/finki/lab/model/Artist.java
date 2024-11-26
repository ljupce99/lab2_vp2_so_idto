package mk.ukim.finki.lab.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String firstName;
    String lastName;
    String bio;

    public Artist(String axl, String rose, String singer) {
        firstName = axl;
        lastName = rose;
        bio = singer;
    }
}
