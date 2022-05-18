package services;

import models.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.HeroDAO;

import javax.transaction.Transactional;

@Service
@Transactional
public class HeroService {
    private HeroDAO heroDAO;

    @Autowired
    public HeroService(HeroDAO heroDAO) {
        this.heroDAO = heroDAO;
    }

    public Hero findById(Integer heroId) {
        return this.heroDAO.findByHeroId(heroId);
    }

    public Integer takeDamage(Integer health) {
        return this.heroDAO.takeDamage(health);
    }

    public Integer getExperience(Integer experience) {
        return this.heroDAO.getExperience(experience);
    }

    public Integer levelUp(Integer level) {
        return this.heroDAO.levelUp(level);
    }
}
