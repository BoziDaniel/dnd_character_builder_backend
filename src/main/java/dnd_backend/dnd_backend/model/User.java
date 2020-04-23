package dnd_backend.dnd_backend.model;

public class User {

    private String email;
    private String userName;
    private String password;
    private String passwordConfirm;

    public User(String email, String userName, String password, String passwordConfirm) {
        this.setEmail(email);
        this.setUserName(userName);
        this.setPassword(password);
        this.setPasswordConfirm(passwordConfirm);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
