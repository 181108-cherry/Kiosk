package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    // 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
    // 속성
    ArrayList<MenuItem> menuItemList;
    Scanner scanner = new Scanner(System.in);

    // 생성자
    public Kiosk(ArrayList<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    // 기능
    public void start(){
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
