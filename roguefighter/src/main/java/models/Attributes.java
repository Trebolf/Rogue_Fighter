package models;

import lombok.*;

import javax.persistence.Column;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Attributes {

    @Column(nullable = false)
    private Integer strength;

    @Column(nullable = false)
    private Integer dexterity;

    @Column(nullable = false)
    private Integer vitality;

    @Column(nullable = false)
    private Integer intelligence;

    @Column(nullable = false)
    private Integer luck;
}
