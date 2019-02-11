package java13.demo4;

public class Main {

    @FunctionalInterface
    interface Converter<F, T> {

        T convert(F from);

    }

    static class A {

        int from = 1;

        void calculate() {

            Converter<Integer, String> stringConverter = from -> String.valueOf(from + ++this.from);

//            Converter<Integer, String> stringConverter = new Converter<Integer, String>() {
//
//                @Override
//                public String convert(Integer from) {
//                    return String.valueOf(from + ++A.this.from);
//                }
//            };

            String result = stringConverter.convert(2);
            System.out.println("result = " + result);
        }

    }

    public static void main(String[] args) {

        A a = new A();
        a.calculate();
        a.calculate();
        a.calculate();
    }
}
