package java18.demo3_Abstract_factory;

public class WinButton implements IButton {

    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}
