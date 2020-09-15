package lesson_3.level_x.super_task1;

class UserLoginService {

/*Проверил Артем:
В методе идет проверка только пароля..
Логин тоже должен проверяться на валидность.*/
    boolean login(User user, String password){
        if (password.equals(user.getUserPassword())) {
            System.out.println("User is login");
            return true;
        }
        else {
            System.out.println("Incorrect password");
            user.setNumberOfAttempts();
//            blockUser(user.getNumberOfAttempts());
//            user.setBlocked();
            if(user.getNumberOfAttempts() == 0){
                user.setBlocked();
            }
            return false;
        }
    }
}
