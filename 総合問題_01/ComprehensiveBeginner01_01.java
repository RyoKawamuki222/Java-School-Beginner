/*
 * 整数値を入力させ、その値が偶数ならばeven、
 * 奇数ならばoddと表示するプログラムを作成してください。
 */

import java.util.Scanner;

class ComprehensiveBeginner01_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int score = scanner.nextInt();
        
        if (score % 2 == 0) {
            
            System.out.println("even");
        
        } else {
            
            System.out.println("odd");
        }
        
        scanner.close();

    }
}