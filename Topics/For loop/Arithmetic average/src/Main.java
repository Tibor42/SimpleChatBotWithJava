import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = 0.0;
        int sum =0;
        int countDivNumbers = 0;
        for (int i=a;i<=b;i++) {
            if (i % 3 == 0) {
                sum +=i;
                
                countDivNumbers ++;
            }
        }
        result = (double) sum / countDivNumbers;
        System.out.println(result);
        
        
    }
}
