package java19.demo1_Adapter;

public class AndroidRecharger {

    private Android phone;

    public AndroidRecharger(Android phone) {
        this.phone = phone;
    }

    public void use() {
        System.out.println("---Recharging Android Phone with Generic Recharger---");
        this.phone.useMicroUsb();
        this.phone.recharge();
        System.out.println("---Phone Ready for use---");
    }
}
