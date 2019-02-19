package java19.demo1_Adapter;

public class Demo1 {

    public static void main(String[] args) {

        new IPhoneRecharger(new IPhone()).use();

        new AndroidRecharger(new Android()).use();

        new MicroUsbRecharger(new IPhone()).use();

    }
}
