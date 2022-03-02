package es.ucm.fdi.iw.model;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
@SequenceGenerator(name = "gen", sequenceName = "gen")
private long id;
@Column(name="score")
private int score;
@ManyToOne(targetEntity = User.class)
private User creator;
@Column(name="text")
private String text;
@OneToOne
private Mentoring mentoring;
}
