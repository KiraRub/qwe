import java.sql.Array;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int b = in.nextInt();
        ArrayList<HeavyBox> massive = new ArrayList<HeavyBox>();
        for (int a = 1; a <= b; a++)
        {
            double ves = Math.random()*100;
            HeavyBox heavyBox = new HeavyBox(ves,a);
            massive.add(heavyBox);
        }
        String e = "1";
        for (HeavyBox heavyBox : massive) {
            System.out.println(heavyBox.Number+" "+heavyBox.Weight);
        }


    }

}




