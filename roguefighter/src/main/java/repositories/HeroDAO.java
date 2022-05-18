package repositories;

import models.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroDAO extends JpaRepository<Hero, Integer> {
    Hero findByHeroId(Integer heroId);
    Integer takeDamage(Integer health);
    Integer getExperience(Integer experience);
    Integer levelUp(Integer level);
}
