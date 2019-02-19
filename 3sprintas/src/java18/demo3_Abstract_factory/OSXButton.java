package java18.demo3_Abstract_factory;

public class OSXButton implements IButton {

    @Override
    public void paint() {
        System.out.println("OSXButton");
    }
}
