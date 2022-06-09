package j;

import java.util.ArrayList;
import java.util.Scanner;

public class Algo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        ArrayList<String> inputList = new ArrayList<>();

        for (int i = 0; i <= cnt; i++) {
            String userInput = sc.nextLine();
            inputList.add(userInput);
        }

        String str = String.join(",", inputList);

        System.out.println("Hello " + str + ".");

        sc.close();
    }

}