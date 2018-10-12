package project.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "I_LANGUAGE")
@NoArgsConstructor
@Data
public class Language {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "LANGUAGE_NATIVE_NAME", nullable = false, length = 100)
    private String languageNativeName;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean isActive = true;

}
