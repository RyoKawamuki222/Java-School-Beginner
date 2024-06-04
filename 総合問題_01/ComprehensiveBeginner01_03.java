/*
 *2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し
 *2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
 */

import java.util.Scanner;

class ComprehensiveBeginner01_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("2次方程式の数字をa,b,cの順番に入力してください");
        
        System.out.print("a=");
        int a = scanner.nextInt();

        System.out.print("b=");
        int b = scanner.nextInt();

        System.out.print("c=");
        int c = scanner.nextInt();

        int D = (b * b) - (4 * a * c);

        if (D == 0) {
            
            System.out.println("重解である");

        } else if (D > 0) {

            System.out.println("2つの実数解である");

        } else {

            System.out.println("2つの虚数解である");
        }
        
        scanner.close();

    }
}