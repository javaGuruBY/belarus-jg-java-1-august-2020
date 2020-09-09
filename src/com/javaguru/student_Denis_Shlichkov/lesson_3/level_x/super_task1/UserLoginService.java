package lesson_3.level_x.super_task1;

class UserLoginService {


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
