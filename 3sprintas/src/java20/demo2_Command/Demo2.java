package java20.demo2_Command;

public class Demo2 {

    public static void main(String[] args) {

        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);

        Switch s = new Switch(switchUp,switchDown);

        s.flipUp();
        s.flipUp();
        s.flipDown();
        s.flipDown();
    }
}
