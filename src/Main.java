public class Main {
    public static void main(String[] args) {
        // Задане 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int q = 10; q >= 1; q-- ) {
            System.out.println(q);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int w = 0; w <= 17; w = w + 2 ){
            System.out.println(w);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int e = 10; e >= -10; e-- ){
            System.out.println(e);
        }
        // Задание 5
        System.out.println("Задание 5");
        for (int r = 1904;  r <= 2096 ; r = r + 4){
            System.out.println(r + " Год является високосным");
        }
        // Задание 6
        System.out.println("Задание 6");
        for (int t = 7; t <= 98; t = t + 7){
            System.out.println(t);
        }
        // Задание 7
        System.out.println("Задание 7");
        for (int y = 1; y <= 512; y = y * 2){
            System.out.println(y);
        }
        // Задание 8
        System.out.println("Задание 8");
        int cash = 29000;
        int month = 0;
        for (int i = 1; i <= 12; i++){
            month = month + cash;
            System.out.println("Месяц " + i + " сумма накоплений равна " + month + " рублей");
        }
        // Задание 9
        System.out.println("Задание 9");
        int month1 = 0;
        int cash1 = 29000;
        for (int i = 1; i <= 12; i++){
            month1 = month1 + month1/100;
            month1 = month1 + cash1;
            System.out.println("Месяц " + i +  " сумма накоплений равна " + month1 + " рублей");
        }
        // Задание 10
        System.out.println("Задание 10");
        int two = 2;
        int number = 0;
        for (int i = 1; i <= 10; i++){
            number = i * two;
            System.out.println(two + "*"+ i + "=" +number);
        }





    }
}