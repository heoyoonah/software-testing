public class Calculator {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 3.0;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        
        // 더하기 연산
        double add = a + b;
        System.out.println(a + " + " + b + " = " + add);
        
        // 빼기 연산
        double sub = a - b;
        System.out.println(a + " - " + b + " = " + sub);
    }
}