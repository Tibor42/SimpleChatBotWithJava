import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String s = scanner.next();

        int l = s.length();
        String newS = "";

        for (int i=0; i<l; i++) {
            char c = s.charAt(i);
            if (c == 'a') newS += 'b';
            else newS +=c;
        }
        System.out.println(newS);
    }
}