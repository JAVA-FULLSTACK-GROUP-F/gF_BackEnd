package unimap.groupf.zerohunger;

import java.util.Optional;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan

/*
 UserRepository extends JpaRepository<User, Long>, 
 which means it is a repository interface for the User entity that provides basic CRUD 
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail ( String email );    //returns an optional user by their email address.

}
