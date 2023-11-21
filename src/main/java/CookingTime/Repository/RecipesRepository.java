package CookingTime.Repository;

import CookingTime.Entity.Recipes;
import CookingTime.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipesRepository  extends JpaRepository<Recipes,Integer> {


    List<Recipes> findAll();
}
