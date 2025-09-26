package com.BudgetPlanner.sdp.repo;

import com.BudgetPlanner.sdp.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByUsername(String username);  

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    User findByUsernameAndPassword(String username, String password);

	boolean existsByUsernameAndPassword(String username, String password);
}
