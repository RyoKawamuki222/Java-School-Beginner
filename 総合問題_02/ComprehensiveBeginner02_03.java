/*
 * 以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
 * buyDrink() メソッドを持つ、Coffee クラスを使用する。
 * buyDrink() メソッドを持つ、Juice クラスを使用する。
 * 
 * バヤリース の オレンジ 味です。130 円になります。
 * 午後の紅茶 の レモンティー 味です。150 円になります。
 * ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
 * ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
 */


public class ComprehensiveBeginner02_03 {

    public static void main(String[] args) {

        Juice a001 = new Juice();
        Coffee a002 = new Coffee();

        a001.name = "バヤリース";
        a001.taste = "オレンジ";
        a001.buyDrink();

        a001.name = "午後の紅茶";
        a001.taste = "レモンティー";
        a001.buyDrink();

        a002.name = "ボス";
        a002.taste = "控え目、 ミルク 無し";
        a002.buyDrink();

        a002.name = "ジョージア";
        a002.taste = "甘め、 ミルク 入り";
        a002.buyDrink();

    }
 }

class Juice {

    String name;
    String taste;
    String bayarisu = "バヤリース";
    String gogotea = "午後の紅茶";
    int price;

    public void buyDrink() {

        if (name.equals(bayarisu)) {

            price = 130;

        } else if (name.equals(gogotea)) {

            price = 150;

        }

        System.out.println(name + " の " + taste + " 味です。" + price + " 円になります。");

    }

}

class Coffee {

    String name;
    String taste;
    String boss = "ボス";
    String jojia = "ジョージア";
    int price;
    
    public void buyDrink() {

        if (name.equals(boss)) {

            price = 110;

        }else if (name.equals(jojia)) {

            price = 120;

        }

        System.out.println(name + " の甘さは " + taste + " です。" + price + " 円になります。");

    }

}
