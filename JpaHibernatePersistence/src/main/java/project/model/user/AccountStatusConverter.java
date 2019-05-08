package project.model.user;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class AccountStatusConverter implements AttributeConverter<AccountStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(AccountStatus attribute) {
        return attribute.getId();
    }

    @Override
    public AccountStatus convertToEntityAttribute(Integer dbData) {
        return AccountStatus.findById(dbData);
    }
}
