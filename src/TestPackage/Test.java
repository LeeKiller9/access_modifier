package TestPackage;

public class Test {
    public int id;
    public String username;
    public String password;

    public Test(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }
}
