import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ChinaCity> cities = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            ChinaCity chinaCity = new ChinaCity();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (Objects.equals(name, "exit")) {
                break;
            }
            chinaCity.setName(name);
            System.out.print("Enter population: ");
            chinaCity.setPopulation(scanner.nextInt());

            if (chinaCity.getName().length() > 0 && chinaCity.getPopulation() > 0) {
                cities.add(chinaCity);
            } else {
                System.out.print("Validation error");
            }

            for (ChinaCity city : cities) {
                System.out.println(city.getName());
                System.out.println(city.getPopulation());
                System.out.println("----------");
            }

            System.out.println();
        }
    }
}