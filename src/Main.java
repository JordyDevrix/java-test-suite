import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String carBrand = input.nextLine();
        String carModel = input.nextLine();
        Integer carYear = input.nextInt();

        Data newCar = new Data(carBrand, carModel, carYear);

        System.out.println(newCar.getSingleCarData());
    }

}