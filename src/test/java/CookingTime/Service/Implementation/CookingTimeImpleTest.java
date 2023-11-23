package CookingTime.Service.Implementation;

import CookingTime.Entity.Recipes;
import CookingTime.Repository.RecipesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CookingTimeImpleTest {


    @Autowired
    public RecipesRepository recipesRepository;


    @Test
    void save_recipes_success(){

        Recipes recipes = new Recipes("Kabsa", "sa", "sa");

        CookingTimeImple cookingTimeImple = new CookingTimeImple();

        String message = cookingTimeImple.saveRecipes(recipes);

        assertEquals(message, "Record  Add");
    }

}