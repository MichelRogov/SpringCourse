package project.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDao {

    private String firstName;
    private String lastName;
    private String email;
    private String languageDescription;
}
