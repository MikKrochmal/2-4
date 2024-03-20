import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("1-dodawanie, 2-odejmowanie, 3-dzielenie, 4-mnożenie");
    int operation = new Scanner(System.in).nextInt();
    System.out.println("Podaj pierwszą liczbę");
    int x = new Scanner(System.in).nextInt();
    System.out.println("Podaj drugą liczbę");
    int y = new Scanner(System.in).nextInt();
    double result = 0;
    switch (operation) {
      case 1:
        result = x + y;
        break;
      case 2:
        result = x - y;
        break;
      case 3:
        result = x / y;
        break;
      case 4:
        if (y != 0) result = x * y;
        else System.out.println("pamiętaj cholero nie dziel przez zero");
        break;
      default:
        System.out.println("nie ma takiej opcji");
    }
    if (operation >= 1 && operation <= 4) {
      System.out.println("Wynik to: " + result);
    }
  }
}