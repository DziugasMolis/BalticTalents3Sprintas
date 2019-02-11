package java13.demo7;

public class Main {

    @FunctionalInterface
    interface Calculate<T, N> {

        T create();

    }

    @FunctionalInterface
    interface Calculate2<T, N> {

        T create(N t1);

    }

    static class A {

        Double n;

        A() {
            this.n = 0.0;
        }

        A(Double n) {
            this.n = n;
        }

        Double calculate(Double d1, Double d2) {
            return n * (d1 + d2);
        }

    }

    public static void main(String[] args) {

        Calculate<A, Double> c = A::new;

        Calculate2<A, Double> c2 = (n) -> new A(n);

        A a = c.create();
        Double result = a.calculate(10.,5.);
        System.out.println("result = " + result);


        A a1 = c2.create(2.0);
        Double result1 = a1.calculate(10.,5.);
        System.out.println("result = " + result1);
    }

}
