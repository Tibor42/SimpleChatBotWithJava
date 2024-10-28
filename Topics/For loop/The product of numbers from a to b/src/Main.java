import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int prod = a;
        for (int i=a+1;i<b;i++) {
            prod = prod *i;
        }
        System.out.println(prod);
    }
}
