package java20.demo2_Command;

// Receiver
public class Light {

    boolean on = false;

    public Light() {}

    public void turnOn() {
        if (on) {
            System.out.println("The light is on already");
        } else {
            on = true;
            System.out.println("The light is on");
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("The light is off already");
        } else {
            on = false;
            System.out.println("The light is off");
        }
    }
}
