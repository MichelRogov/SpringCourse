package project.repository;

import project.model.user.UserInfoDao;

public interface UserAccountRepositoryCustom {

    UserInfoDao getUserInfoDaoByEmail(String email);
}
