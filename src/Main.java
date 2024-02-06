import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int ageYear = input.nextInt();
        int ageMonth = input.nextInt();
        int ageDay = input.nextInt();

        System.out.println(ageYear);

        KassaSysteem checkAge = new KassaSysteem(ageYear, ageMonth, ageDay);

        System.out.println("Jaar checken...");
        if (checkAge.getLeeftijdJaar() == 0) {
            System.out.println("Niet oud genoeg.");
        } else if (checkAge.getLeeftijdJaar() == 1) {
            System.out.println("Maand checken...");
            if (checkAge.getLeeftijdMaand() == 0) {
                System.out.println("Niet oud genoeg.");
            } else if (checkAge.getLeeftijdMaand() == 1) {
                System.out.println("Dag checken...");
                if (checkAge.getLeeftijdDag() == 0) {
                    System.out.println("Niet oud genoeg");
                } else if (checkAge.getLeeftijdDag() == 1) {
                    System.out.println("Oud genoeg");
                }
            } else if (checkAge.getLeeftijdMaand() == 2) {
                System.out.println("Oud genoeg");
            }
        } else if (checkAge.getLeeftijdJaar() == 2) {
            System.out.println("Oud genoeg.");
        }
    }
}