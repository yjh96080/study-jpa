package study.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@DiscriminatorValue("A")
@Getter
public class Album extends Item {

    private String artist;
    private String etc;

}