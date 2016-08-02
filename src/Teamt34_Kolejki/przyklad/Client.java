package Teamt34_Kolejki.przyklad;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class Client {
    private String nickname;

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Client(String nickname) {
        setNickname(nickname);
    }

    @Override
    public String toString() {
        return nickname;
    }
}