package CookingTime.Controller;

import CookingTime.Entity.Recipes;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(RecipesController.class)
class RecipesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSaveRecipes() throws Exception {

        Recipes recipes = new Recipes();
        recipes.setTitle("Test Recipe");
        recipes.setIngredients("Ingredient ");
        recipes.setInstructions("Step 1");

        String recipesJson = objectMapper.writeValueAsString(recipes);

        ResultActions result = mockMvc.perform(MockMvcRequestBuilders
                        .post("/store")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(recipesJson))
                .andExpect(MockMvcResultMatchers.status().isOk());


    }
}
