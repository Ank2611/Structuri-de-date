import java.util.Scanner;

public class StackReader {
    CustomStack customStack = new CustomStack(10);
    int elem;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrie + pt a adauga in stiva, - pt a scoate din stiva, 0 pt terminare");
        String type = sc.next();

        while (type.equals("+") && !type.equals("0")) {
            System.out.println("Intro un nr");
            elem = sc.nextInt();
            customStack.push(elem);
            type = sc.next();
        }


        while (type.equals("-") && !type.equals("0") && !customStack.isEmpty()) {
            elem = customStack.pop();
            System.out.println("POP " + elem);
            type = sc.next();
        }
        System.out.println("");
        type = "0";
    }

    public void printCurrentStack() {
        while (!customStack.isEmpty()) {
            elem = customStack.pop();
            System.out.print(elem);
            System.out.print(" ");
        }
        System.out.println("");

    }
}
