package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.model.user.User;
import project.model.user.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    UserAccount findByUser(User user);

    @Query("SELECT uc.language.description FROM UserAccount uc WHERE uc.user.id = :userId")
    String findLanguageDesByUserId(@Param("userId") Long userId);
}
