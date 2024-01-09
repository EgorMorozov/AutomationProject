package jenerics;
@FunctionalInterface
public interface TestFunctionalInterface<T,V> {
    void calculate(T a,V b);

    default void pintHello(){
        System.out.println("Hello");
    }
}
