/*
 * 1から100までの値を繰り返しで表示するが
 * 3の倍数の時はfoo、5の倍数の時はbarと数字の代わりに表示するプログラムを作成してください。
 */

class ComprehensiveBeginner01_06 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("foobar" + " ");

            } else if (i % 3 == 0) {

                System.out.print("foo" + " ");

            } else if (i % 5 == 0) {

                System.out.print("bar" + " "); 

            } else {

                System.out.print(i + " ");
                
            }
        }
    }
}