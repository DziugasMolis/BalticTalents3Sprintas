package java20.demo1_ChainOfResponsibility;

public class Demo1 {

    public static void main(String[] args) {

        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();

        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        for (double i = 1; i < 31000.0; i += 1000) {
            manager.processRequest(new PurchaseRequest(i, "General"));
        }

    }

}
