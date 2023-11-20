package CookingTime.Repository;

import CookingTime.Entity.Admin;
import CookingTime.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository<Admin,Integer> {
}
