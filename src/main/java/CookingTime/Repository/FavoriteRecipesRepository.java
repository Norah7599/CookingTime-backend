package CookingTime.Repository;

import CookingTime.Entity.Admin;
import CookingTime.Entity.FavoriteRecipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRecipesRepository extends JpaRepository<FavoriteRecipes,Integer> {
}
