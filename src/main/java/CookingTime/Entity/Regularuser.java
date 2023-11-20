package CookingTime.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Data

public class Regularuser extends Users {
    @OneToMany(targetEntity = FavoriteRecipes.class,cascade = CascadeType.ALL)
    @JoinColumn(name="ru_fk",referencedColumnName = "userid")
    private Set<FavoriteRecipes> favorit;

}

