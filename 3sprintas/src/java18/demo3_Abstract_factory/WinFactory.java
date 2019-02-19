package java18.demo3_Abstract_factory;

public class WinFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new WinButton();
    }
}
