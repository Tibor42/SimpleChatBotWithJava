import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i=1;i<=n;i++) {
            String s = scanner.next();
            if (s.equals("A")) {
                countA++;
            }
            if (s.equals("B")) {
                countB++;
            }
            if (s.equals("C")) {
                countC++;
            }
            if (s.equals("D")) {
                countD++;
            }
        }

        System.out.println(countD + " " + countC + " " + countB + " " +countA);

    }
}