package com.mum.pm.user_module.repository;

        import com.mum.pm.user_module.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
