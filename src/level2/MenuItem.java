package level2;

public class MenuItem {

    // 속성
    String name;
    int price;
    String explanation;

    //생성자
    public MenuItem(){

    }

    // 기능
    public MenuItem(String name, int price, String explanation) {

        int num = 0;

        if (num == 1){
            String name = "Espresso";
            int price = 2500;
            String explanation = "커피의 기본";
        } else if (num == 2) {
            String name = "Americano";
            int price = 3000;
            String explanation = "심플함 속 깊은 풍미";
        } else if (num == 3) {
            String name = "Caffe Latte";
            int price = 3500;
            String explanation = "커피와 고소한 우유";
        } else if (num == 4) {
            String name = "Vanilla Latte";
            int price = 4000;
            String explanation = "천연 바닐라와 고소한 우유";
        } else if (num == 5) {
            String name = "Cream Mocha";
            int price = 4500;
            String explanation = "진한 라떼에 수제 크림이 올라간 커피";
        } else if (num == 6) {
            String name = "Einspänner";
            int price = 4500;
            String explanation = "블랙커피 위에 수제 크림이 올라간 커피";
        } else if (num == 0) {
            System.out.println("주문을 취소하려면 exit을 입력해주세요.");
        }
    }
}
