package models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enemyId;

    @Column(nullable = false)
    private Integer health;

    @Column(nullable = false)
    private Integer minDamage;

    @Column(nullable = false)
    private Integer maxDamage;

    @Column(nullable = false)
    private Abilities passives;

    @Column(nullable = false)
    private Abilities actives;

    @Column(nullable = false)
    private Integer givenExperience;
}
