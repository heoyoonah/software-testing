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

        // 곱하기 연산
        double mul = a * b;
        System.out.println(a + " × " + b + " = " + mul);
        
        // 나누기 연산
        if (b != 0) {
            double div = a / b;
            System.out.println(a + " ÷ " + b + " = " + div);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}