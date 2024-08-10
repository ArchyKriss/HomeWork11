public class Main {
    //task1
    public static void isYearLeap(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    //task2
    public static void printRecomendation(int clientDiviseYear, int clientOS2){
        if(clientDiviseYear>=2015&&clientOS2==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientDiviseYear>=2015&&clientOS2==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientDiviseYear<2015&&clientOS2==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientDiviseYear<2015&&clientOS2==1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    //task3
    public static int calculateDistanceTime(int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //task1
        int number = 100;
        isYearLeap(number);

        //task2
        int OS2 = 0;
        int clientDiviceYear = 2024;
        printRecomendation(clientDiviceYear, OS2);

        //task3
        int deliveryDistance = 50;
        int days = calculateDistanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}