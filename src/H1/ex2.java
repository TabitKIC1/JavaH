package H1;



import java.util.Scanner;


public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int numberr = scanner.nextInt();
        scanner.close();

        int a=1;
        for (int i = 1; i <= numberr ; i++) {

           a = a * i;
            System.out.println(a);
        }

        }


}
