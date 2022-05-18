package repositories;

import models.Hero;
import models.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsDAO extends JpaRepository<Stats, Integer> {
    Stats setHeroHealth(Hero health);
    Stats setHeroMin(Hero minDamage);
    Stats setHeroMax(Hero maxDamage);
    Stats setCritChance(Hero critChance);

}
