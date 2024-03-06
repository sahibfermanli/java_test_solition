import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ChinaCity> cities = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            ChinaCity chinaCity = new ChinaCity();

            System.out.print("Enter name: ");
            chinaCity.setName(scanner.nextLine());
            System.out.print("Enter population: ");
            chinaCity.setPopulation(scanner.nextInt());

            if (chinaCity.getName().length() > 0 && chinaCity.getPopulation() > 0) {
                cities.add(chinaCity);
            } else {
                System.out.print("Validation error");
            }

            for(int i = 0; i < cities.size(); i++) {
                System.out.println(cities.get(i).getName());
                System.out.println(cities.get(i).getPopulation());
                System.out.println("----------");
            }

            System.out.println();
        }
    }
}