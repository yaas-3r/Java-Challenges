public class main {
    public static void main(String[] args) {
        Admin admin = new Admin(1, "UserOne", "userone@example.com");
        User user = new User(2, "UserTwo", "usertwo@example.com");

        DataSource view = new View();
        DataSource update = new Update();
        DataSource delete = new Delete();

        admin.performOperation(view);
        user.performOperation(update);
        admin.performOperation(delete);
    }
}
