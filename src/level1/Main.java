package level1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ____________________________________________________________");
        System.out.println(" 1. Espresso      ㅣ💰 2.5 ㅣ 커피의 기본");
        System.out.println(" 2. Americano     ㅣ💰 3.0 ㅣ 심플함 속 깊은 풍미");
        System.out.println(" 3. Caffe Latte   ㅣ💰 3.5 ㅣ 커피와 고소한 우유");
        System.out.println(" 4. Vanilla Latte ㅣ💰 4.0 ㅣ 천연 바닐라와 고소한 우유 ");
        System.out.println(" 5. Cream Mocha   ㅣ💰 4.5 ㅣ 진한 라떼에 수제 크림이 올라간 커피 ");
        System.out.println(" 6. Einspänner    ㅣ💰 4.5 ㅣ 블랙커피 위에 수제 크림이 올라간 커피 ");
        System.out.println(" 0. 종료 ");
        System.out.println(" ____________________________________________________________");

            System.out.println("원하시는 메뉴의 번호를 선택하십시오.");
            int num = scanner.nextInt();

            String menu;
            int price = 0;

            if (num == 1) {
                menu = "Espresso";
                price = 2500;
                System.out.println("선택하신 메뉴는 " + num + "번" + menu + "입니다.");
                System.out.println(menu + " 맞습니까? (yes or no)");
            } else if (num == 2) {
                menu = "Americano";
                price = 3000;
                System.out.println("선택하신 메뉴는 " + num + "번" + menu + "입니다.");
                System.out.println(menu + " 맞습니까? (yes or no)");
            } else if (num == 3) {
                menu = "Caffe Latte";
                price = 3500;
                System.out.println("선택하신 메뉴는 " + num + "번" + menu + "입니다.");
                System.out.println(menu + " 맞습니까? (yes or no)");
            } else if (num == 4) {
                menu = "Vanilla Latte";
                price = 4000;
                System.out.println("선택하신 메뉴는 " + num + "번" + menu + "입니다.");
                System.out.println(menu + " 맞습니까? (yes or no)");
            } else if (num == 5) {
                menu = "Cream Mocha";
                price = 4500;
                System.out.println("선택하신 메뉴는 " + num + "번" + menu + "입니다.");
                System.out.println(menu + " 맞습니까? (yes or no)");
            } else if (num == 6) {
                menu = "Einspänner";
                price = 4500;
                System.out.println("선택하신 메뉴는 " + num + "번 " + menu + "입니다.");
                System.out.println(menu + "가 맞습니까? (yes or no)");
            } else if (num == 0) {
                System.out.println("주문을 취소하려면 exit을 입력해주세요.");
            }

            String choose = scanner.next();

            if (choose.equals("yes")) {
                System.out.println("주문이 완료되었습니다.");
                System.out.println("결제하실 금액은 " + price + "원 입니다.");
            } else if (choose.equals("no")) {
                System.out.println("메뉴를 다시 선택해주세요.");
            } else if (choose.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
            }

    }
}
