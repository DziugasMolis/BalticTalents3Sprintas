package java13.demo8;

public class Main {

    @FunctionalInterface
    interface Calculate<N> {

        N calc(N n1, N n2);

    }

    static class A {

        double n;

        A(Double n) {
            this.n = n;
        }

        Double calculate(Double d1, Double d2) {
            return (d1 + d2) / n;
        }

        String sudetiString(String a1, String a2) {
            return a1 + a2;
        }

    }

    public static void main(String[] args) {

        A a = new A(2.0);

        Calculate<Double> c = a::calculate;

        Calculate<String> c2 = a::sudetiString;

        Double result = c.calc(10.0, 11.0);
        System.out.println("result = " + result);

        String result1 = c2.calc("a ", "b");
        System.out.println("result = " + result1);
    }

}
