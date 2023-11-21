package CookingTime.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

import static jakarta.persistence.ConstraintMode.CONSTRAINT;

@Data
@Entity @AllArgsConstructor @NoArgsConstructor
public class FavoriteRecipes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int favoriteid;

    @ManyToOne
    @JoinColumn(name = "userid")
    private Users regularuser;

    @ManyToOne
    @JoinColumn(name ="recipesid")
    private Recipes recipes;

    public FavoriteRecipes( Users regularuser, Recipes recipes) {

        this.regularuser = regularuser;
        this.recipes = recipes;
    }
}
