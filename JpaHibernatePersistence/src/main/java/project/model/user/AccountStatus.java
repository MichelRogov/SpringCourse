package project.model.user;

import java.util.Arrays;

public enum AccountStatus {
    NEW(1);

    private Integer id;

    AccountStatus(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static AccountStatus findById (Integer id) {
        if (id == null){
            throw new IllegalArgumentException("id can not be null");
        }
        return Arrays
                .stream(AccountStatus.values())
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .get();
    }
}
