package java13.demo2;

public class Main {

    @FunctionalInterface
    interface Avg<T> {

        T avg(T n1, T n2);

    }


    public static void main(String[] args) {

//        Avg<Integer> calc = new Avg<Integer>() {
//            @Override
//            public Integer avg(Integer n1, Integer n2) {
//                return (n1 + n2) / 2;
//            }
//        };

        Avg<Integer> calc = (n1, n2) -> (n1 + n2) / 2;

        Integer result = calc.avg(200, 300);
        System.out.println("result = " + result);
    }
}
