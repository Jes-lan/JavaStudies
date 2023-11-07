import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correct = 0,wrong = 0;
        Student[] students = new Student[30];
        char[] anahtar = new char[10];

        System.out.println("Cevap anahtarını giriniz.");
        for (int i = 0; i < 10; i++) anahtar[i] = scanner.next().charAt(0);

        System.out.println("Öğrenci bilgilerini giriniz.");
        for (int i = 0; i < 1; i++) {
            System.out.println("Öğrenci no: ");
            students[i] = new Student();
            students[i].okulNo = scanner.nextInt();

            System.out.println("Öğrencinin cevaplarını giriniz.");
            for (int j = 0; j < 10; j++) {
                students[i].cevap[j] = scanner.next().charAt(0);

                if (anahtar[j] == students[i].cevap[j])
                    correct++;
                else
                    wrong++;
            }
            students[i].not = correct - (wrong/4);
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("öğrenci no = " + students[i].okulNo);
            System.out.println("net sayısı = " + students[i].not);
        }

    }
}