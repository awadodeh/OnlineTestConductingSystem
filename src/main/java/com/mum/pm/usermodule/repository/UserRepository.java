package com.mum.pm.usermodule.repository;

        import com.mum.pm.usermodule.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
