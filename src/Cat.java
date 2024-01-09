public class Cat extends Animal implements Move{
    String tail;

    public void moveTail(){
        System.out.println("I am tailing");
    }

    @Override
    public void walk() {
        System.out.println("Cat I am move");
    }
}
