package java19.demo1_Adapter;

public class Android implements IFormatAndroid {

    private boolean connectorOk = false;

    @Override
    public void recharge() {
        if(connectorOk) {
            System.out.println("Recharge Started");
            System.out.println("Recharge 20%");
            System.out.println("Recharge 50%");
            System.out.println("Recharge 70%");
            System.out.println("Recharge Finished");
        } else {
            System.out.println("Connect MicroUsb first");
        }
    }

    @Override
    public void useMicroUsb() {
        connectorOk = true;
        System.out.println("MicroUsb connected");
    }
}
