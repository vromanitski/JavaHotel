package by.romanitski.model;

public class User {

    private String userName;
    private String userPassword;
    private String userKeyWord;
    private Boolean isAdmin = false;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserKeyWord() {
        return userKeyWord;
    }

    public void setUserKeyWord(String userKeyWord) {
        this.userKeyWord = userKeyWord;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
