import java.util.Scanner;
public class Ghoul {
    public static void main(String[] args) {
        System.out.println("Вы Гуль?");
        System.out.println("1) Да");
        System.out.println("2) Нет");
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        if (sc1 == 1) {
            for (int x = 1000; x > 0; x = x - 7) {
                try {
                    Thread.sleep(35);
                } catch (InterruptedException ex) {
                }
                int res = x - 7;
                System.out.println(x + "-7 " + "= " + res);
            }
            System.out.println("Хорошего дня :)");
        }
        if (sc1 == 2) {
            System.out.println("Хорошего дня :)");
        }
    }
}
