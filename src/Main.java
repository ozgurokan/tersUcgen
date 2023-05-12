import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int stepNumber;

        Scanner input = new Scanner(System.in);

        // adım sayısı kullanıcıdan alınır
        System.out.print("Adım sayısını giriniz: ");
        stepNumber = input.nextInt();


        // içerdeki döngüler adım sayısı kadar i birer azaltılarak döndürülür
        for (int i = stepNumber-1; i >= 0; i--) {

            // yıldızların başındaki boşlukları oluşturmk için döngü kurulur
            for (int k = 0; k < (stepNumber - i); k++) {
                System.out.print(" ");
            }
            // yıldızları yazdırmak için döngü kurulur
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}