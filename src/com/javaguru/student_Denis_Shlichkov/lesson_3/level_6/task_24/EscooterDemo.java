package lesson_3.level_6.task_24;

class EscooterDemo {
    public static void main(String[] args){
        //создаём электроскутер модели Halten RS-02
        Escooter escooterHalten =
                new Escooter("Halten RS-02", 55, 28, 150);

        //создаём электроскутер модели NineBot Max
        Escooter escooterNineBotMax =
                new Escooter("NineBot Max", 40, 20, 120);

        //получение состояния фонаря скутера Halten
        System.out.println("E-Scooter light is: " + escooterHalten.getLightOnOff());

        //включение фонаря скутера Halten
        escooterHalten.setLightOnOff(true);
        System.out.println("E-Scooter light is: " + escooterHalten.getLightOnOff());

        //поездка на скутере NineBot
        System.out.println("Current speed NineBot Max is: " + escooterNineBotMax.getCurrentSpeed());
        escooterNineBotMax.setSpeedUp(5);
        System.out.println("Current speed NineBot Max is: " + escooterNineBotMax.getCurrentSpeed());
        escooterNineBotMax.setSpeedUp(10);
        System.out.println("Current speed NineBot Max is: " + escooterNineBotMax.getCurrentSpeed());
        escooterNineBotMax.setSpeedUp(20);
        System.out.println("Current speed NineBot Max is: " + escooterNineBotMax.getCurrentSpeed());
        escooterNineBotMax.setSpeedDown(21);
        System.out.println("Current speed NineBot Max is: " + escooterNineBotMax.getCurrentSpeed());

    }
}
