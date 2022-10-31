public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1

        for(int i =1; i <=10 ; i++){
            System.out.println("Итерация цикла " + i);
        }


        // Задача 2

        for(int i=10;i>0;i--){
            System.out.println("Отсчёт пошел " + i);
        }

        // Задача 3

        for (int i=0+2;i<=17;i=i+2){
            System.out.println("Чётное число " + i);
        }

        // Задача 4

        for(int i=10;i>-11;i--) {
            System.out.println("Цикл  " + i);
        }

        // Задача 5

        for(int i=1904;i<=2096;i=i+4){
            System.out.println(i + " Год является високосным");
        }

        // Задача 6

        for(int i=7;i<=98;i=i+7){
            System.out.println("Цифра " +i);
        }

        // Задача 7

            for(int i=1;i<=512;i*=2){
                System.out.println(i + " Число");
            }

        // Задача 8

        int saveMoney=29000;
        int total =0;

        for(int i=0;i<12;i++){
        total=total+total/100;
        total=total+saveMoney;
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }
}