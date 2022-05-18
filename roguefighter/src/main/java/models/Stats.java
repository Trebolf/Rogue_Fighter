package models;

import lombok.*;

import javax.persistence.Column;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Stats {

    @Column(nullable = false)
    private Integer health;

    @Column(nullable = false)
    private Integer minDamage;

    @Column(nullable = false)
    private Integer maxDamage;

    @Column(nullable = false)
    private Integer critChance;

    @Column(nullable = false)
    private Integer defense;

    @Column(nullable = false)
    private Integer focus;

    @Column(nullable = false)
    private Integer knowledge;

    @Column(nullable = false)
    private Integer luck;
}
