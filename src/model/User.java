package model;

/**
 * Created by Valerie on 09.08.2014.
 */
public class User
{
    private int UserId;
    private String Login;
    private String Password;

    public User(){}

    public User(int userId, String login, String password) {
        UserId = userId;
        Login = login;
        Password = password;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
