package CookingTime.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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

@OneToMany (mappedBy = "recipes")
@JsonIgnoreProperties("Recipes")
private List<FavoriteRecipes> R;


}
