package unimap.groupf.zerohunger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean   //userRepository bean from AppConfig can be injected into a service that handles user-related operations
    public UserRepository userRepository() {
        return new UserRepositoryImpl();    
    }   
}
