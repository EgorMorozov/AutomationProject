public class Canguru extends Animal implements Move, Juping {

    @Override
    public void jump() {
        System.out.println("Canguru I am jumping");
    }

    @Override
    public void walk() {
        System.out.println("Canguru I am walking");

    }
}
