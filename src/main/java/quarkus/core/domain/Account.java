package quarkus.core.domain;

public class Account {
    String name;
    Long accountId;
    Long phone;
    Long newPhone;
    String email;

    public Account() {
    }

    public Account(String name, Long accountId, Long phone, Long newPhone, String email) {
        this.name = name;
        this.accountId = accountId;
        this.phone = phone;
        this.newPhone = newPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(Long newPhone) {
        this.newPhone = newPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountId=" + accountId +
                ", phone=" + phone +
                ", newPhone=" + newPhone +
                ", email='" + email + '\'' +
                '}';
    }
}