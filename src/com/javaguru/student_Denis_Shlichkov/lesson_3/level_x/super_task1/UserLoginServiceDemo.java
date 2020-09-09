package lesson_3.level_x.super_task1;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        User user = new User("Petroff", "12345");
        UserLoginService service = new UserLoginService();
        service.login(user, "12345");
        service.login(user, "1234");
        service.login(user, "1234");
        service.login(user, "1234");
    }
}
