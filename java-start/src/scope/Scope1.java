package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존시작
        if (true) {
            int x = 20; //x 생존시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
        System.out.println("if m = " + m);
        //System.out.println("if x = " + x);
        //지역변수 스코프 이탈 (선언된 코드 블록 {})
        //스코프를 사용하면 코드의 복잡도를 줄일 수 있다.
    }
}
