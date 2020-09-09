package lesson_3.level_x.super_task1;

class User {
    private String userName;
    private String userPassword;
    private boolean isBlocked = false;
    private int numberOfAttempts = 3;

    User(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void setBlocked() {
        System.out.println("User is blocked");
        isBlocked = true;
    }

/*    public void resetNumberOfAttempts() {
        this.numberOfAttempts = 3;
    }
*/
    public void setNumberOfAttempts(){
        numberOfAttempts -= 1;
    }

    public int getNumberOfAttempts(){
        return numberOfAttempts;
    }
/*
    public String getUserName() {
        return userName;
    }
*/
    public String getUserPassword() {
        return userPassword;
    }
}
