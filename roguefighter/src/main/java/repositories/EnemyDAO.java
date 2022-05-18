package repositories;

import models.Enemy;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyDAO {
    Enemy findByEnemyId(Integer enemyId);
    Integer takeDamage(Integer health);
    Integer giveExperience(Integer givenExperience);
}
