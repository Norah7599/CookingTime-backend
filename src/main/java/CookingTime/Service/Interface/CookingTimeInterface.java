package CookingTime.Service.Interface;

import CookingTime.Entity.FavoriteRecipes;
import CookingTime.Entity.Recipes;
import CookingTime.Entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CookingTimeInterface {

    public String  saveRecipes( Recipes R);
    public String  saveUser( Users U);
    public List<Recipes> getAllRecipes();
    public String deleterecipeid(Integer recipeid);
    public Recipes updateRecipes(Recipes recipes);


    public String  saveFavorite( FavoriteRecipes F);
    public List<FavoriteRecipes> getAllFavoriterecipes();
    public String deleteFavoriteid(Integer favoriteid);

}
