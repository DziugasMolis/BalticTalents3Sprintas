package java19.demo1_Adapter;

public class IPhoneRecharger {

    private IPhone phone;

    public IPhoneRecharger(IPhone phone) {
        this.phone = phone;
    }

    public void use() {
        System.out.println("---Recharging iPhone with iPhone Recharger---");
        this.phone.useLightning();
        this.phone.recharge();
        System.out.println("---iPhone Ready for use---");
    }
}
