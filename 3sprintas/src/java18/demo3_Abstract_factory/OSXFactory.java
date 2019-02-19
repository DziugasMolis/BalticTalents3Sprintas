package java18.demo3_Abstract_factory;

public class OSXFactory implements IGUIFactory {

    @Override
    public IButton createButton() {
        return new OSXButton();
    }
}
