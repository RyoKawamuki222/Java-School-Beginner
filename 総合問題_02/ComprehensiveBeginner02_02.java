/*
 * ・ジャンケンプログラムを作成してください。
 * 1ジャンケンと表示させる。
 * 2 "0:グー 1:チョキ 2: パー ＞数字を入力してください"　左記の数字が入力された場合、後続の処理に進み、
 * それ以外の数字が入力された場合、エラーとして説明した後に1、に戻るようにする。
 * 3 今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する。
 */

 import java.util.Scanner;
 import java.util.Random;

 class ComprehensiveBeginner02_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("ジャンケン");
        System.out.println("コンピューター(com)とのジャンケンです");
        System.out.println("キーボードで0:グー 1:チョキ 2: パー ＞数字を入力してください");

        int i = scanner.nextInt();
        int com = rand.nextInt(3);

        while ((i != 0 && i != 1 && i != 2) || (i == com)) {

            while (i != 0 && i != 1 && i != 2) {

                System.out.println("別の文字が入力されています、0:グー 1:チョキ 2: パー ＞の数字どれかを入力してください");

                i = scanner.nextInt();
                com = rand.nextInt(3);
            
                while (i == com) {

                    if (i == 0) {

                        System.out.println("[あなた] グー [com] グー");

                    } else if (i == 1) {

                        System.out.println("[あなた] チョキ [com] チョキ");

                    } else if (i == 2) {

                        System.out.println("[あなた] パー [com] パー");

                    }

            System.out.println("引き分けです、再度0:グー 1:チョキ 2: パー ＞の数字どれかを入力してください");

            i = scanner.nextInt();
            com = rand.nextInt(3);
                  
                }

            }
            
        }

        if (i == 0) {

            if (com == 1) {

                System.out.println("[あなた] グー [com] チョキ");
                System.out.println("あなたの勝ちです、ジャンケンを終了します");

            } else if (com == 2) {

                System.out.println("[あなた] グー [com] パー");
                System.out.println("あなたの負けです、ジャンケンを終了します");

            }

        } else if (i == 1) {

            if (com == 0) {

                System.out.println("[あなた] チョキ [com] グー");
                System.out.println("あなたの負けです、ジャンケンを終了します");
                
            } else if (com == 2) {

                System.out.println("[あなた] チョキ [com] パー");
                System.out.println("あなたの勝ちです、ジャンケンを終了します");

            }

        } else if (i == 2) {

            if (com == 0) {

                System.out.println("[あなた] パー [com] グー");
                System.out.println("あなたの勝ちです、ジャンケンを終了します");

            } else if (com == 1) {

                System.out.println("[あなた] パー [com] チョキ");
                System.out.println("あなたの負けです、ジャンケンを終了します");

            }

        }

        scanner.close();

    }
}