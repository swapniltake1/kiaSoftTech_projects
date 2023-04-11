import java.util.Scanner;

public class BillGenerator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] s = new String[] { "idly Sambar", "Wada Samber", "dosa   ", "Poori Bhaji", "Paratha",
                "Vada Pao", "Misal   ", "tea   ", "coffee", "Total  " };
        int[] rate = new int[] { 30, 35, 40, 30, 25, 15, 100, 10, 15, 0 };
        int[] qt = new int[10];
        int sum = 0;
        boolean quit = true;

        do {
            System.out.println("ITEM" + "\t\t\tPRICE");
            for (int i = 0; i < 10; i++)
                System.out.println((i + 1) + "." + s[i] + "\t\t" + rate[i]);

            int ch = input.nextInt();
            if (ch > 0 && ch < 10) {
                System.out.println("enter the no of quantites of " + s[ch - 1]);
                int q = input.nextInt();
                qt[ch - 1] += q;

            } else {
                quit = false;

            }

        } while (quit);

        System.out.println("Your Orders are:\n");
        for (int i = 0; i < 10; i++) {
            if (qt[i] != 0) {
                sum += qt[i] * rate[i];
                System.out.println(s[i] + "*" + qt[i] + " = " + qt[i] * rate[i] + "Rs");
            }
        }

        System.out.println("Your total bill=" + sum);

        System.out.println("Thank you !! ");

    }

}