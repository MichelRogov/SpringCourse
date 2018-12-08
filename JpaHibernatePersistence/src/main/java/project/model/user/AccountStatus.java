package project.model.user;

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
}
