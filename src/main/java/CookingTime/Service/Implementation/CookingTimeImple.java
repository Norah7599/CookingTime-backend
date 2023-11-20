package CookingTime.Service.Implementation;

import CookingTime.Entity.FavoriteRecipes;
import CookingTime.Entity.Recipes;
import CookingTime.Entity.Users;
import CookingTime.Repository.FavoriteRecipesRepository;
import CookingTime.Repository.RecipesRepository;
import CookingTime.Repository.UsersRepository;
import CookingTime.Service.Interface.CookingTimeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CookingTimeImple implements CookingTimeInterface{

    @Autowired
    public RecipesRepository recipesRepository;
   public FavoriteRecipesRepository favoriteRecipesRepository;
    public UsersRepository usersRepository;

    @Override
    public String saveRecipes (Recipes R){

        try{ recipesRepository.save(R);}
        catch (Exception a){ System.out.println("An error occurred while creating the record "+ a.getMessage());
            return null;}
        return "Record  Add";
    }
    @Override
    public String saveUser (Users U){
        try{usersRepository.save(U);
        } catch (Exception o){
            System.out.println("An error occurred while creating the record "+ o.getMessage());
            return null;}
        return "Record  Add";
    }
    @Override
    public List<Recipes> getAllRecipes() {
        try {
            return recipesRepository.findAll();
        } catch (Exception c) {
            System.out.println("Failed to fetch the data: " + c.getMessage());
            return null;}
    }
    @Override
    public String deleterecipeid(Integer recipeid) {
        try{ recipesRepository.deleteById(recipeid);}
        catch (Exception b){ System.out.println("An error occurred while deleting the recipe record " + b.getMessage());
            return null;}
        return "Record deleted";
    }

    @Override
    public Recipes updateRecipes (Recipes recipes){
        try{  return recipesRepository.save(recipes);}
        catch(Exception t){ System.out.println("An error occurred while updating the recipe record " + t.getMessage());
            return null;}
    }


    @Override
    public String saveFavorite( FavoriteRecipes F){

        try{ favoriteRecipesRepository.save(F);}
        catch (Exception l){ System.out.println("An error occurred while creating the record "+ l.getMessage());
            return null;}
        return "Record  Add";
    }
    @Override
    public List<FavoriteRecipes> getAllFavoriterecipes() {
        try {
            return favoriteRecipesRepository.findAll();
        } catch (Exception m) {
            System.out.println("Failed to fetch the data: " + m.getMessage());
            return null;}
    }
    @Override
    public String deleteFavoriteid(Integer favoriteid) {
        try{ favoriteRecipesRepository.deleteById(favoriteid);}
        catch (Exception p){ System.out.println("An error occurred while deleting the favoriterecipes record " + p.getMessage());
            return null;}
        return "Record deleted";
    }
}



