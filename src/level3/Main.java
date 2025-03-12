package level3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // List 선언 및 초기화
        ArrayList<MenuItem> menuItemList = new ArrayList<>();

        menuItemList.add(new MenuItem("Espresso",2500,"커피의 기본"));
        menuItemList.add(new MenuItem("Americano",3000,"심플함 속의 깊은 풍미"));
        menuItemList.add(new MenuItem("Caffe Latte",3500,"커피와 고소한 우유"));
        menuItemList.add(new MenuItem("Vanilla Latte",4000,"천연 바닐라와 고소한 우유"));
        menuItemList.add(new MenuItem("Cream Mocha",4500,"진한 라떼에 수제 크림이 올라간 커피"));
        menuItemList.add(new MenuItem("Einspänner",4500,"블랙커피 위에 수제 크림이 올라간 커피"));

        System.out.println(" ____________________________________________________________");
        System.out.println(" 1. " + menuItemList.get(0).name + "      ㅣ💰 " + menuItemList.get(0).price + " ㅣ" + menuItemList.get(0).detail);
        System.out.println(" 2. " + menuItemList.get(1).name + "    ㅣ💰 " + menuItemList.get(1).price + "ㅣ " + menuItemList.get(1).detail);
        System.out.println(" 3. " + menuItemList.get(2).name + "    ㅣ💰 " + menuItemList.get(2).price + "ㅣ " + menuItemList.get(2).detail);
        System.out.println(" 4. " + menuItemList.get(3).name + "    ㅣ💰 " + menuItemList.get(3).price + "ㅣ " + menuItemList.get(3).detail);
        System.out.println(" 5. " + menuItemList.get(4).name + "    ㅣ💰 " + menuItemList.get(4).price + "ㅣ " + menuItemList.get(4).detail);
        System.out.println(" 6. " + menuItemList.get(5).name + "    ㅣ💰 " + menuItemList.get(5).price + "ㅣ " + menuItemList.get(5).detail);
        System.out.println(" 0. 종료 ");
        System.out.println(" ____________________________________________________________");

        Kiosk kiosk = new Kiosk(menuItemList);
        kiosk.start();
    }
}
