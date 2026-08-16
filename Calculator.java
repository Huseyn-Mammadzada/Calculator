import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-ci ədədi daxil edin : ");
        double eded1 = scanner.nextDouble();

        System.out.println("Əməliyyat növünü daxil edin +,-,*,/");
        String emeliyyat = scanner.next();

        System.out.println("2-ci ədədi daxil edin : ");
        double eded2 = scanner.nextDouble();


        switch (emeliyyat) {
            case "+":
                System.out.println("Cəm = " + (eded1 + eded2));
                break;
            case "-":
                System.out.println("Fərq = " + (eded1 - eded2));
                break;
            case "*":
                System.out.println("Hasil = " + (eded1 * eded2));
                break;
            case "/":
                if (eded2 != 0) {
                    System.out.println("Qismət = " + eded1 / eded2);
                } else {
                    System.out.println("Xəta: Sıfıra bölmək olmaz!");

                }
                break;
            default:
                System.out.println("Xəta: Yanlış əməliyyat növü daxil etdiniz!");
                break;
        }
        scanner.close();

    }
}
