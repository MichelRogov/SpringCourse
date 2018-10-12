package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.user.*;
import project.repository.LanguageRepository;
import project.repository.UserAccountRepository;
import project.repository.UserRepository;
import project.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private static final int LANGUAGE_ID = 1;

    @Autowired
    UserRepository userRepository;
    @Autowired
    LanguageRepository languageRepository;
    @Autowired
    UserAccountRepository userAccountRepository;

    @Override
    public void createUser(UserWebDto userWebDto) {
        User user = saveUser(userWebDto);
        createUserAccount(user, userWebDto);
    }

    @Override
    public UserInfoDao findUserByEmail(String email) {
        User user = userRepository.findByEmail(email);
//        UserAccount userAccount = userAccountRepository.findByUser(user);
//        Optional<Language> language = languageRepository.findById(userAccount.getLanguage().getId());

//        Integer languageId = userAccountRepository.findLanguageDesByUserId(user.getId());
//        Optional<Language> language = languageRepository.findById(languageId);

        String languageDes = userAccountRepository.findLanguageDesByUserId(user.getId());
        return new UserInfoDao(user.getFirstName(), user.getLastName(), user.getEmail(), languageDes);
    }

    private void createUserAccount(User user, UserWebDto userWebDto) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUser(user);
        userAccount.setStatusId(AccountStatus.NEW.getId());

        Optional<Language> language = languageRepository.findById(userWebDto.getUserLanguageId());
        if(!language.isPresent()){
            language = languageRepository.findById(LANGUAGE_ID);
        }
        userAccount.setLanguage(language.get());
        userAccountRepository.save(userAccount);
    }

    public User saveUser(UserWebDto userWebDto){
        User user = new User();
        user.setFirstName(userWebDto.getFirstName());
        user.setLastName(userWebDto.getLastName());
        user.setEmail(userWebDto.getEmail());
        userRepository.save(user);
        return user;
    }

}
