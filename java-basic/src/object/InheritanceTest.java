package object;

class Circle extends Object {

    Circle(){
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString()); //object메소드
    }
}
