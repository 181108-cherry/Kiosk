package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("원하시는 메뉴의 번호를 선택하세요.");

        Scanner scanner = new Scanner(System.in);

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

        while (true) {
            System.out.println("원하시는 메뉴의 번호를 선택하십시오.");
            int num = scanner.nextInt();
            System.out.println("선택하신 메뉴는 " + num + "번 " + menuItemList.get(num - 1).name + "입니다.");
            System.out.println(menuItemList.get(num - 1).name + " 맞습니까? (yes or no)");

            String choose = scanner.next();

            if (choose.equals("yes")) {
                System.out.println("주문이 완료되었습니다.");
                System.out.println("결제하실 금액은 " + menuItemList.get(num - 1).price + "원 입니다.");
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (choose.equals("no")) {
                System.out.println("메뉴를 다시 선택해주세요.");
            } else if (choose.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
