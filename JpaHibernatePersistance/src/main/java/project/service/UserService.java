package project.service;

import project.model.user.UserWebDto;
import project.model.user.UserInfoDao;

public interface UserService {

    void createUser(UserWebDto userWebDto);

    UserInfoDao findUserByEmail(String email);
}
