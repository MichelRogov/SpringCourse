package project.service.impl;

import org.springframework.stereotype.Service;
import project.processor.annotations.SettingsMapping;
import project.service.UserService;
import project.shared.CommonSettings;

/**
 * Created by Rogov on 12.11.2017.
 */
@Service
public class UserServiceImpl implements CommonSettings, UserService {

    @SettingsMapping(key = "UserService")
    public void getSettings() {
        System.out.println("UserService");
    }
}