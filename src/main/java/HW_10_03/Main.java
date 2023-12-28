package HW_10_03;

public class Main {
    public static void main(String[] args) {
        Adding add1 = new Adding();
        try {
            int A = add1.getClass().getMethod("mathSum", int.class, int.class).getAnnotation(Math.class).num1();
            int B = add1.getClass().getMethod("mathSum", int.class, int.class).getAnnotation(Math.class).num2();
            add1.mathSum(A, B);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }

}
