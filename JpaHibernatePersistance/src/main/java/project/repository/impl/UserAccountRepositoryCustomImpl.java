package project.repository.impl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.model.user.UserInfoDao;
import project.repository.UserAccountRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserAccountRepositoryCustomImpl implements UserAccountRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public UserInfoDao getUserInfoDaoByEmail(String email) {

        StringBuilder query = new StringBuilder()
                .append("SELECT new project.model.user.UserInfoDao ")
                .append("(u.firstName, u.lastName, u.email, uc.language.description)")
                .append("FROM UserAccount uc inner join uc.user u WHERE u.id = uc.user.id AND u.email = :email");

        return (UserInfoDao) entityManager.createQuery(query.toString())
                .setParameter("email", email)
                .getSingleResult();
    }

//    @Query("SELECT new project.model.user.UserInfoDao " +
//            "(u.firstName, u.lastName, u.email, uc.language.description)" +
//            "FROM UserAccount uc inner join uc.user u WHERE u.id = uc.user.id AND u.email = :email")
}
