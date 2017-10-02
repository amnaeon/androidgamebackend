package hello.models.response_model;

public class UserResponseModel {
    private String token = "";
    private String login = "";

    public UserResponseModel() {
    }

    public UserResponseModel(String token, String login) {
        this.token = token;
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
