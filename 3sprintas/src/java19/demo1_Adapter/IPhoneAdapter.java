package java19.demo1_Adapter;

// Adapter
public class IPhoneAdapter implements IFormatAndroid {

    private IFormatIPhone mobile;

    public IPhoneAdapter(IFormatIPhone mobile) {
        this.mobile = mobile;
    }

    @Override
    public void recharge() {
        this.mobile.recharge();
    }

    @Override
    public void useMicroUsb() {
        System.out.println("Adapter MicroUsb <-> Lightning connected");
        this.mobile.useLightning();
    }
}
