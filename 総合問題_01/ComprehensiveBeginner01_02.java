/*
 * 整数値を３つ入力させ、それらの値が小さい順(等しくても良い)に
 * 並んでいるかを判定し、小さい順に並んでいるば良いはOK、
 * そうなっていない場合はNGと表示するプログラムを作成してください。
 */

import java.util.Scanner;

class ComprehensiveBeginner01_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first <= second && second <= third) {

            System.out.println("OK");

        } else {
            System.out.println("NG");

        }

        scanner.close();
        
    }
}