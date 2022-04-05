package es.ucm.fdi.iw.model;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "mentoring")
public class Mentoring {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
    @SequenceGenerator(name = "gen", sequenceName = "gen")
    private long id;

    @ManyToOne
    @JoinColumn(name = "MENTOR_ID")
    private User mentor;
    private String classroom;   
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")    
    private Date date;

    @ManyToMany
    @JoinColumn(name = "TAG_ID")
    private List<Tag> tags;

    @OneToMany
    @JoinColumn(name = "REVIEW_ID")
    private List<Review> reviews;

}
