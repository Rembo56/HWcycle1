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

        // Задача 8 День 2 переделанная задача

        int saveMoney=15000;
        int total =0;
        int i = 0;

        while(total<2_459_000){
        total=total+total/100;
        total=total+saveMoney;
        i=i+1;
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }


        // Задача 2



        int a = 0;
        while(a<=9) {
            a++;
            System.out.print(" " + a);
        }

        System.out.println();

        for (int w =10; w >= 1; w--) {
            System.out.printf( " " + w );
        }
        System.out.println();



        // Задача 3

        int y = 12_000_000;
        int bornYear = y/1000 * 17;
        int deadYear = y/1000 * 8;
        int incPeople = bornYear-deadYear;
        int r = 0;
        while (r<10){
            y=incPeople+y;
            r=r+1;

            System.out.println("Год " + r + " численность населения составляет " + y);

        }
        System.out.println();

        // Задача 4  // Задача 5  // Задача 6

        int save=15000;

        for(int p = 1;p <=108;p ++) {
            save=save+save*7/100;
            if (p % 6 == 0) {
                System.out.println("Месяц " + p + " сумма накоплений равна " + save + " рублей");
            }
        }
        System.out.println();

        // Задача 7


        int day = 6;
        while (day<=31){
            day++;
            if(day%7==0){
                System.out.println("Сегодня пятницa " + day + "е число,необходимо предоставить отчёт");
            }
        }

        System.out.println();

        //  Задача 8


        int year = 1830;

        while (year<2100){
            year++;
            if(year%79==0){
                System.out.println(year);
            }
        }

        System.out.println();

        // Задача 9

        for (int v =1;v<=10;v++){
                System.out.println("2*" + v +"=" +2 * v);
        }
    }
}