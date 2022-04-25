import java.util.Scanner;

public class Cin_Zodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int yil;
        System.out.print("Dogum yilinizi giriniz: ");
        yil=inp.nextInt();

        switch (yil % 12) {
            case 0:
                System.out.println("MAYMUN");
                break;
            case 1:
                System.out.println("HOROZ");
                break;
            case 2:
                System.out.println("KOPEK");
                break;
            case 3:
                System.out.println("DOMUZ");
                break;
            case 4:
                System.out.println("FARE");
                break;
            case 5:
                System.out.println("OKUZ");
                break;
            case 6:
                System.out.println("KAPLAN");
                break;
            case 7:
                System.out.println("TAVSAN");
                break;
            case 8:
                System.out.println("EJDERHA");
                break;
            case 9:
                System.out.println("YILAN");
                break;
            case 10:
                System.out.println("AT");
                break;
            case 11:
                System.out.println("KOYUN");
                break;
        }
    }
}
