package day3;

public class Loop {
    public void printNumbersUpTo100(){
        int n = 100;
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    public int calculateSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public void printEvenNumbersUpTo100(){
        int n = 100;
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public void printMultiplicationTable(int n){
        for(int i = 1; i <= n; i++){
            int kq = n * i;
            System.out.println(kq);
        }
    }
    public boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // 5
                return false;
            }
        }
        return true;
    }
    public int getFibonacciNumber(int n){
        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
    public void printNumberTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public int calculateFactorial(int n){
        if(n == 1){
            return n;
        }
        int kq = 1;
        for (int i = 1; i <= n; i++) {
            kq = kq * i;
        }
        return kq;
    }
    public int countDigits(int n){
        int dem = 0;
        while (n != 0){
            n = n / 10;
            dem++;
        }
        return dem;
    }
    public void printIsPrime(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public boolean isPalindrome(int x){
        String s = String.valueOf(x);
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.equals(s);
    }
    public void palindrome(int x){
        for (int i = 1; i <= x; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public int findGCD (int a, int b){
        if (b == 0){
            return a;
        }
        while(b!=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int findBCN(int a, int b){
        return Math.abs(a * b)/ findGCD(a, b);
    }
}
