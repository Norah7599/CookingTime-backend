package CookingTime.Service.Implementation;

import CookingTime.DTO.Favorite;
import CookingTime.Entity.FavoriteRecipes;
import CookingTime.Entity.Recipes;
import CookingTime.Entity.Regularuser;
import CookingTime.Entity.Users;
import CookingTime.Repository.FavoriteRecipesRepository;
import CookingTime.Repository.RecipesRepository;
import CookingTime.Repository.RegularuserRepository;
import CookingTime.Repository.UsersRepository;
import CookingTime.Service.Interface.CookingTimeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CookingTimeImple implements CookingTimeInterface{

    @Autowired
    public RecipesRepository recipesRepository;
    @Autowired
   public FavoriteRecipesRepository favoriteRecipesRepository;
    @Autowired
    public UsersRepository usersRepository;

    @Autowired
    public RegularuserRepository regularuserRepository;

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
    public List<Recipes> getRecipesList() {
        try {
            return recipesRepository.findAll();
        } catch (Exception c) {
            System.out.println("Failed to fetch the data: " + c.getMessage());
            return null;
        }
    }
    @Override
    public String deleterecipeid(Integer recipeid) {
        try{ recipesRepository.deleteById(recipeid);
        return "Recipe with " + recipeid + "deleted";}
        catch (Exception b){ System.out.println("An error occurred while deleting the recipe record " + b.getMessage());
            return null;}
    }

    @Override
    public Recipes updateRecipes (Recipes recipes){
        try{  return recipesRepository.save(recipes);}
        catch(Exception t){ System.out.println("An error occurred while updating the recipe record " + t.getMessage());
            return null;}
    }


    @Override
    public String saveFavorite( Favorite F){
        Optional<Users> userReg = usersRepository.findById(F.getUserid());
        Optional<Recipes>recipes =recipesRepository.findById(F.getRecipesid());
        System.out.println(F.getUserid());
        System.out.println(F.getRecipesid());
        FavoriteRecipes fr = new FavoriteRecipes(userReg.get(), recipes.get());
        try{
            favoriteRecipesRepository.save(fr);
        }
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



