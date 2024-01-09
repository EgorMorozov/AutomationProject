public interface Move {

    default public void walk(){
        System.out.println("I am Wailking");

    }

    public static void testStatic(){
        System.out.println("test");
    };


}
