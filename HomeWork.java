package src.JavaCore_for_QC.lesson5;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile('example.csv');
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV( resultFileName: "new_example.csv");
    }
}
