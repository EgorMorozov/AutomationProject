public class Calculator {


    private int summ(Integer a, Integer b) {
        return a + b;
    }

    private int multiply(Long a, Long b) {
        return (int) (a * b);
    }

    public int calculate(Object a, Object b) {
        try {
            return a instanceof Integer ? summ((Integer) a, (Integer) b) : multiply((Long) a, (Long) b);
        } catch (ClassCastException classCastException) {
            System.out.println("что-то пошло не так");
            return 0;
        }
    }
}