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
    @OneToMany (mappedBy = "regularuser", cascade = CascadeType.ALL)
    private List<FavoriteRecipes> U;

}

