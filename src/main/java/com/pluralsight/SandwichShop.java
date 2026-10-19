package com.pluralsight;

public class sandwhich shop{
  public static void main(String[] args) {

System.out.print("How old are you if you don't mind me asking? ");
int age = scan.nextInt();
        System.out.print("How old are you if you don't mind me asking: ");
boolean condition2 = true;
int age = 0;

        while (condition2){
        while (!scan.hasNextInt()) {
String invalidInput = scan.next();
                System.out.println("'" + invalidInput + "' is not a valid integer.");
                System.out.print("Please enter an integer for your age: ");
            }
age = scan.nextInt();
condition2 = false;
        }

String size;
        double basePrice, finalPrice;
@@ -42,5 +53,6 @@ public static void main(String[] args) {
    finalPrice = basePrice;
}
        System.out.printf("Your %s sandwich costs: $%.2f", size, finalPrice);
        scan.close();
    }
            }
}