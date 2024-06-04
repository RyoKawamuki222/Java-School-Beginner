/*スロットマシーンプログラムを作成してください。
 * 1,ゾロ目で大当たり!チャンスは30回と表示させる。
 * 2,beginと入力してください。と入力すると、開始するようにする。
 * 3,ランダムな３つの自然数を"〇回目：xxx"というように表示する。
 * 4,大当たり(ゾロ目)〇回目で大当たりです。おめでとうございます！と表示させる
 * 5,30回のうちに大当たりが出なかった場合残念でした。終わりますと表示させる
 */

import java.util.Scanner;
import java.util.Random;

class ComprehensiveBeginner02_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.println("beginと入力してください");

        String a = scanner.nextLine();
        
        Random rand = new Random();

        int b = 0;

        while (!(a.equals("begin"))) {

            System.out.println("beginと入力してください");
            a = scanner.nextLine();

        }
        
        for (int i = 1; i <= 30; i++) {
            
            int random1 = rand.nextInt(10);
            int random2 = rand.nextInt(10);
            int random3 = rand.nextInt(10);

            System.out.println(String.format("%2d", i) + "回目" + " " + random1 + " " + random2 + " " + random3);
           
            if (i == 30 && (random1 != random2 || random2 != random3) && b == 0) {

                System.out.println("残念でした。終わります。");

            } else if (random1 == random2 && random2 == random3) {

                System.out.println(i + "回目で大当たりです。おめでとうございます!");

                break;

            }

        }

        scanner.close();

    }
}