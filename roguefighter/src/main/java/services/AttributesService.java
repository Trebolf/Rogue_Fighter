package services;

import models.Attributes;
import models.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AttributesDAO;
import repositories.HeroDAO;

import javax.transaction.Transactional;

@Service
@Transactional
public class AttributesService {
    private AttributesDAO attributesDAO;

    @Autowired
    public AttributesService(AttributesDAO attributesDAO) {
        this.attributesDAO = attributesDAO;
    }

    public Attributes strengthToMax(Stats maxDamage) {
        return this.attributesDAO.strengthToMax(maxDamage);
    }

    public Attributes strengthToMin(Stats minDamage) {
        return this.attributesDAO.strengthToMin(minDamage);
    }

    public Attributes dexterityToMin(Stats minDamage) {
        return this.attributesDAO.dexterityToMin(minDamage);
    }

    public Attributes dexterityToCrit(Stats critChance) {
        return this.attributesDAO.dexterityToCrit(critChance);
    }

    public Attributes vitalityToHP(Stats health) {
        return this.attributesDAO.vitalityToHP(health);
    }

    public Attributes vitalityToDef(Stats defense) {
        return this.attributesDAO.vitalityToDef(defense);
    }

    public Attributes intelligenceToFocus(Stats focus) {
        return this.attributesDAO.intelligenceToFocus(focus);
    }

    public Attributes intelligenceToKnowledge(Stats knowledge) {
        return this.attributesDAO.intelligenceToKnowledge(knowledge);
    }

    public Attributes luckToCrit(Stats critChance) {
        return this.attributesDAO.luckToCrit(critChance);
    }

    public Attributes luckToLoot(Stats luck) {
        return this.attributesDAO.luckToLoot(luck);
    }
}
