
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // в конструкторе указан третьим параметром этаж, на котором находиться человек
        // с этого этажа и начинается путь

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------");
            System.out.println("Введите этаж: ");
            int num = scanner.nextInt();
            Elevator elevator = new Elevator(1, 10);
            elevator.move(num);
        }
    }
}
