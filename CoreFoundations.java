public class CoreFoundations {

  public static void main(String[] args) {
    int items = 4;
    double price = 2.50;
    char size = 'M';
    boolean isStudent = true;
    double subtotal = items * price;
    double tax = subtotal * 0.10;
    double total = subtotal + tax;
    int minutes = 135;
    int h = minutes / 60;
    int m = minutes % 60;
    System.out.println("Size: " + size);
    System.out.println("Total: " + total);
    System.out.println("Student: " + isStudent);
    System.out.println(h + "h " + m + "m");
  }
}