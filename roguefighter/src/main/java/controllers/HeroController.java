package controllers;

import models.Hero;
import models.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.HeroService;
import utils.JsonResponse;

@RestController
@RequestMapping("hero")
public class HeroController {
    private HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("{heroId}")
    public JsonResponse getHeroById(@PathVariable Integer heroId) {
        Hero hero = this.heroService.findById(heroId);

        if (hero == null) {
            return new JsonResponse(false, "Hero not found", null);
        }
        return new JsonResponse(true, "Hero: ", hero);
    }

    @PatchMapping("health/{health}")
    public JsonResponse takeDamage(@PathVariable Integer health) {
        Integer heroHealth = this.heroService.takeDamage(health);
        
        return new JsonResponse(true, "Current health: ", heroHealth);
    }
}
