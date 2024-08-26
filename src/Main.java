

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
class Candle {


    public static void main(String[] args) {
        System.out.println("hello World!");
        System.out.println();

        String name = "jon";
        System.out.println("Hello, " + name);

        int age;
        System.out.println("how old are you?");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();


        System.out.println("Ah!\n"
        + "Wonderful!!!\n"
        + "Let me just light those candles for you...");

        Candle[] candles = new Candle[age];

        for (int i = 0; i < age; i++) {
            candles[i] = new Candle();
            candles[i].light();
            System.out.println( (i + 1) + ":  "
             + ((candles[i].getIsList()) ? "Shining Brightly" : "Smoking Ash") << "\n");
        }




    }




}