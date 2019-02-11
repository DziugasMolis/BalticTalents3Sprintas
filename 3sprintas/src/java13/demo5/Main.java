package java13.demo5;

public class Main {

    @FunctionalInterface
    interface Calculate {

        Double calc(Double n1, Double n2);

        default Double sq(Double n) {
            return n * n;
        }

    }

    static class A {

        void calculate() {

            Calculate c = new Calculate() {
                @Override
                public Double calc(Double n1, Double n2) {
                    return Math.sqrt(this.sq(n1) + this.sq(n2));
                }
            };

//            Calculate c1 = (n1, n2) -> Math.sqrt(this.sq(n1) + this.sq(n2));  // Kodel klaida!!!!

            Double result = c.calc(3.0, 4.0);
            System.out.println("result = " + result);
        }

    }


    public static void main(String[] args) {

        new A().calculate();
    }
    
}
