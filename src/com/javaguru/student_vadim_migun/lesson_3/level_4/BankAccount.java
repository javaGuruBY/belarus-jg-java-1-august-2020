package com.javaguru.student_vadim_migun.lesson_3.level_4;
/*
Найти ошибку в коде.
Исправить и запустить программу.

class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.money = money;
    }

    public String getOwnerFirstName( {
        return this.ownerFirstName
    }

    public String getOwnerLastName) {
        return this.ownerFirstName
    }

    public void getMoneyAmount() {
        return this.moneyAmount;
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerFirstName = bankAccount.getOwnerLastName();
        String moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}

 */
    class BankAccount {

        private String ownerFirstName;
        private String ownerLastName;
        private int moneyAmount;

        public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount){

            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        public String getOwnerFirstName() {
            return this.ownerFirstName;
        }

        public String getOwnerLastName() {
            return this.ownerLastName;
        }

        public int getMoneyAmount() {
            return this.moneyAmount;
        }

    }


    class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
            String ownerFirstName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }

    }


