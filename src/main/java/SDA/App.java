package SDA;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Tablice tab = new Tablice();
        Random generator = new Random();

//        System.out.println("Tablica przed posortowaniem:");
//        int[] tabNieposortowana = new int[4];
//        for (int i = 0; i < tabNieposortowana.length; i++) {
//
//            tabNieposortowana[i] = generator.nextInt(4) + 1;
//            System.out.print(tabNieposortowana[i] + " , ");
//        }

//tab.countingSort(tabNieposortowana);
tab.countingSort(new int[]{3,3,1,2});

    }

}
