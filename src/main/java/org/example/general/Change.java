package org.example.general;

/**
 * @author kiyota
 */
public class Change {

    public static void main(String[] args) {
        double funds = 1.00;
        int itemsBought = 0;
        // 金銭計算に浮動小数点を使っている
        for (double price = 0.10; funds >= price; price +=0.10){
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("change: $" + funds);
    }
}
