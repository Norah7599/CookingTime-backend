package CookingTime.Repository;

import CookingTime.Entity.Recipes;
import CookingTime.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipesRepository  extends JpaRepository<Recipes,Integer> {
}
