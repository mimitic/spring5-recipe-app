package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by mimitic on 03/07/2018.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
