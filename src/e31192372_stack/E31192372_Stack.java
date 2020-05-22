package e31192372_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class E31192372_Stack {

    public static void main(String[] args) throws IOException {
        // Create a new, empty stack
        Stack lifo = new Stack();
        System.out.println("===========================");
        System.out.println("==Program Stack Sederhana =");
        System.out.println("===========================");
        System.out.println("= Data yang Ingin Dimasukkan Kedalam Stack==");
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
        String test = masuk.readLine();
        int x = Integer.parseInt(test);

        for (int a = x; a > 0; --a) {
            System.out.print("Masukkan push stack :");
            String test1 = masuk.readLine();
            lifo.push(test1);
        }

        System.out.println(" Stack :" + lifo);
        System.out.println(" top :" + lifo.peek());
        System.out.println(" noel :" + lifo.size());
        System.out.println(" Berapa kali ingin melakukan pop :");
        String b = masuk.readLine();
        int c = Integer.parseInt(b);
        for (int d = c; d > 0; --d) {
            System.out.println(" Pop :" + lifo.pop());
            System.out.println(" Stack :" + lifo);
        }
        System.out.println(" top :" + lifo.peek());
        System.out.println(" noel :" + lifo.size());
        System.out.println(" Terima kasih");

    }
}
