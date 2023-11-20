package CookingTime.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class FavoriteRecipes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int favoriteid;
    @ManyToMany
    @JoinTable(
            name = "favorite",
            joinColumns = @JoinColumn(name = "favoriteid"),
            inverseJoinColumns = @JoinColumn(name = "recipeid")
    )
    private Set<Recipes> recipes;


}
