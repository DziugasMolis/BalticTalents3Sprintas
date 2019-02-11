package java13.demo3;

public class Main {

    @FunctionalInterface
    interface Converter<F, T> {

        T convert(F from);

    }

    public static void main(String[] args) {

        final int num = 10;
        Converter<Integer, String> stringConverter = from -> String.valueOf(from + num);
        String result = stringConverter.convert(2);
        System.out.println("result = " + result);

        Converter<String, Integer> integerConverter = from -> Integer.valueOf(from + "2");
        System.out.println(integerConverter.convert("2"));
    }
}
