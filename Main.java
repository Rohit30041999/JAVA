import java.util.*;

public class Main {

  public static int getLargestNumber(int number) {
    
    int[][] table = new int[number][number];
    
    for(int i=0; i<number; i++) {
      table[i][0] = 1;
    }
    
    for(int j=0; j<number; j++) {
      table[0][j] = 1;
    }
    
    for(int i=1; i<number; i++) {
      for(int j=1; j<number; j++) {
        table[i][j] = table[i-1][j] + table[i][j-1];
      }
    }

    return table[number-1][number-1];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(getLargestNumber(number));
  }
}