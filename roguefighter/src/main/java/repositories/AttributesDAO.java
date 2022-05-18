package repositories;

import models.Attributes;
import models.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributesDAO extends JpaRepository<Attributes, Integer> {
    Attributes strengthToMax(Stats maxDamage);
    Attributes strengthToMin(Stats minDamage);

    Attributes dexterityToMin(Stats minDamage);
    Attributes dexterityToCrit(Stats critChance);

    Attributes vitalityToHP(Stats health);
    Attributes vitalityToDef(Stats defense);

    Attributes intelligenceToFocus(Stats focus);
    Attributes intelligenceToKnowledge(Stats knowledge);

    Attributes luckToCrit(Stats critChance);
    Attributes luckToLoot(Stats luck);

}
