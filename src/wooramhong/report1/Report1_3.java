package wooramhong.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int temp=0;

        temp=x;
        x=y;
        y=z;
        z=temp;

        // Ex)
        AddClass addClass = new AddClass();
        addClass.test();
    }
}

// 필요하다면 클래스 추가
class AddClass {
    void test() {
        System.out.println("AddClass.test");
    }
}
