import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String s = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String r = s.substring(a,b +1);
        System.out.println(r);
    }
}