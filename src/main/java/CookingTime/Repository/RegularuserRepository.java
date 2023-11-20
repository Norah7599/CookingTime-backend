package CookingTime.Repository;

import CookingTime.Entity.Regularuser;
import CookingTime.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegularuserRepository  extends JpaRepository<Regularuser,Integer> {
}
