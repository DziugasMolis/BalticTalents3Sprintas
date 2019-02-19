package java20.demo2_Command;

public class TurnOffLightCommand implements Command{

    private Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOff();
    }
}
