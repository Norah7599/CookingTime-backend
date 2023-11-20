package CookingTime.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

@Entity
@Data

public class Recipes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  recipeid;
    private  String title;
    private String ingredients;
    private String instructions;


    @ManyToMany(mappedBy = "recipes")
    private Set<FavoriteRecipes> favorite ;

}
