import java.util.ArrayList;

class Numbers {

  // Method for 3rd exercise
  public static boolean divisibleByThirteen(ArrayList<Integer> lst) {
    for (int i = 0; i < lst.size(); i++) {
      System.out.println(lst.get(i));
      if (lst.get(i) % 13 == 0) {
        return true;
      }
    }
    return false;
  } 

  public static void main(String[] args) {

    // 1st exercise - Continue
    for (int i = 0; i < 100; i++) {
      if (i % 5 != 0) {
        continue;
      }
      System.out.println(i);
    }

    System.out.println("\n");

    // 2nd exercise - Break
    for (int i = 100; i > 0; i--) {
      System.out.println(i);
      if (i % 12 == 0) {
        break;
      }
    }

    System.out.println("\n");

    // 3rd exercise - Return
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for (int i = 100; i > 0; i--) {
      numbers.add(i);
    }

    System.out.println(divisibleByThirteen(numbers));

  }
} 