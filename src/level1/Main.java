package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ____________________________________________________________");
        System.out.println(" 1. Espresso      ㅣ💰 2.5 ㅣ 커피의 기본");
        System.out.println(" 2. Americano     ㅣ💰 3.5 ㅣ 심플함 속 깊은 풍미");
        System.out.println(" 3. Caffe Latte   ㅣ💰 4.5 ㅣ 커피와 고소한 우유");
        System.out.println(" 4. Vanilla Latte ㅣ💰 5.0 ㅣ 천연 바닐라와 고소한 우유 ");
        System.out.println(" 5. Cream Mocha   ㅣ💰 5.5 ㅣ 진한 라떼에 수제 크림이 올라간 커피 ");
        System.out.println(" 6. Einspänner    ㅣ💰 5.5 ㅣ 블랙커피 위에 수제 크림이 올라간 커피 ");
        System.out.println(" ____________________________________________________________");

        Scanner scanner = new Scanner(System.in);

        System.out.println("원하시는 메뉴의 번호를 선택하십시오.");
        int num = scanner.nextInt();
        System.out.println("선택하신 메뉴는 " + num + "번 입니다.");


    }
}
