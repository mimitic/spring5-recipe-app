package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 6/1/17.
 */

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        /*Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        System.out.println("Category Id: " + categoryOptional.get().getId());

        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("UnitOfMeasure Id: " + unitOfMeasureOptional.get().getId());*/

        log.debug("Getting index page...");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
