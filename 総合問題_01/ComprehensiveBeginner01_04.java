/*
 * とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、
 * 20人以上の団体なら一人500円である。
 * 人数を入力し、入場料の合計を計算するプログラムを作成してください。
 */

import java.util.Scanner;

class ComprehensiveBeginner01_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ninzu = scanner.nextInt();

        if (ninzu <= 4) {

            System.out.println(ninzu * 600 + "円");

        } else if (ninzu >= 5 && ninzu <= 19) {

            System.out.println(ninzu * 550 + "円");

        } else {

            System.out.println(ninzu * 500 + "円");
        }
        
        scanner.close();

    }
}