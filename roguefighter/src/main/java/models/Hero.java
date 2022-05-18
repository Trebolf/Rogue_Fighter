package models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer heroId;

    @Column(nullable = false)
    private Integer level;

    @Column(nullable = false)
    private List<Attributes> attributes;

    @Column(nullable = false)
    private List<Stats> stats;

    @Column(nullable = false)
    private Abilities actives;

    @Column(nullable = false)
    private Abilities passives;

    @Column(nullable = false)
    private Integer experience;
}
