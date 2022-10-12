import TestPackage.Test;

public class TestMain extends Test {
    public TestMain(int id, String username, String password) {
        super(id, username, password);
    }

    public static void main(String[] args) {
        TestMain obj1 = new TestMain(123,"Tim","123");
        obj1.setPassword("666677");
        obj1.id = 1234;
    }
}
