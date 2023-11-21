package CookingTime.Controller;

import CookingTime.DTO.Favorite;
import CookingTime.Entity.FavoriteRecipes;
import CookingTime.Entity.Recipes;
import CookingTime.Entity.Users;
import CookingTime.Service.Implementation.CookingTimeImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CooK")
public class RecipesController {

    @Autowired
    public CookingTimeImple cookingTimeImple;

    @PostMapping("/store")
    public String saveRecipes(@RequestBody Recipes R )
    {
        return cookingTimeImple.saveRecipes(R);
    }
    @PostMapping("/storeUser")
    public String saveUser(@RequestBody Users U) {return cookingTimeImple.saveUser(U);
    }
    @GetMapping("/recipesList")
    public List<Recipes> getRecipesList() {
        return cookingTimeImple.getRecipesList();
    }
    @DeleteMapping ("/delete/{recipeid}")
    public String deleterecipeid(@PathVariable Integer recipeid)
    {
        return cookingTimeImple.deleterecipeid(recipeid);
    }
    @PutMapping("/update")
    public Recipes updateRecipes(@RequestBody Recipes recipesid)
    {
        return cookingTimeImple.updateRecipes(recipesid);
    }
    @PostMapping("/storeFavorite")
    public String saveFavorite(@RequestBody Favorite F )
    {
        return cookingTimeImple.saveFavorite(F);
    }
     @GetMapping("/Favoriterecipes")
    public List<FavoriteRecipes> favoriteRecipesList (){
         return cookingTimeImple.getAllFavoriterecipes();
    }

    @DeleteMapping ("/deleteFavorite/{favoriteid}")
    public String deleteFavoriteid(@PathVariable Integer favoriteid)
    {
        return cookingTimeImple.deleteFavoriteid(favoriteid);
    }


}
