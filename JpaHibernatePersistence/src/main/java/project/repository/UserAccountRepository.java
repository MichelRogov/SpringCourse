package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.model.user.User;
import project.model.user.UserAccount;
import project.model.user.UserInfoDao;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long>, UserAccountRepositoryCustom {

    UserAccount findByUser(User user);

    @Query("SELECT uc.language.description FROM UserAccount uc WHERE uc.user.id = :userId")
    String findLanguageDesByUserId(@Param("userId") Long userId);

    @Query("SELECT new project.model.user.UserInfoDao " +
            "(uc.user.firstName, uc.user.lastName, uc.user.email, uc.language.description)" +
            "FROM UserAccount uc WHERE uc.user.id = :userId")
    UserInfoDao getUserInfoDaoByUserId(@Param("userId") Long userId);

//    @Query("SELECT new project.model.user.UserInfoDao " +
//            "(u.firstName, u.lastName, u.email, uc.language.description)" +
//            "FROM UserAccount uc inner join uc.user u WHERE u.id = uc.user.id AND u.email = :email")
//    UserInfoDao getUserInfoDaoByEmail(@Param("email") String email);
}
