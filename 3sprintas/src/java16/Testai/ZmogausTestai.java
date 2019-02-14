package java16.Testai;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZmogausTestai {

    @Test
    void testasGautiAmziu() {
        Zmogus zmogus = new Zmogus("Jonas", "Jonaitis", 14);
        Integer amzius = zmogus.getAmzius();
        assertEquals(14, amzius);
    }

    @Test
    void testasGautiVardaPavarde() {
        Zmogus zmogus = new Zmogus("Jonas", "Jonaitis", 14);
        String vardasPavarde = zmogus.getVardasPavarde();
        assertEquals("JonasJonaitis", vardasPavarde);
    }
}
