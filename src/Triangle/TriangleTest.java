package Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        do{
            System.out.println("Nhập các cạnh của tam giác có độ dài là a, b, c");
            System.out.print("nhập cạnh a: ");
            a = sc.nextDouble();
            System.out.print("nhập cạnh b: ");
            b = sc.nextDouble();
            System.out.print("nhập cạnh c: ");
            c = sc.nextDouble();

            if(a <= 0 || b <= 0 || c <= 0){
                System.out.println("Không hợp lệ, vui lòng nhập lại.");
            }
        } while(a <= 0 || b <= 0 || c <= 0);


        Triangle triangle = new Triangle(a, b, c);
        triangle.display();
    }
}
