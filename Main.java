import java.util.*;

public class Main {

  public static int getLargestNumber(int number) {
    
    int[] table = new int[]{1, 2, 6, 20, 70, 252, 924, 3432, 12870, 48620};

    return table[number-1];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(getLargestNumber(number));
    scanner.close();
  }
}