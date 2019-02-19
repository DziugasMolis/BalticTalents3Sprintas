package java19.demo1_Adapter;

// Adaptee
public class IPhone implements IFormatIPhone {

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
            System.out.println("Connect Lightning first");
        }
    }

    @Override
    public void useLightning() {
        connectorOk = true;
        System.out.println("Lightning connected");
    }
}
