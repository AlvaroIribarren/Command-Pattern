import Coloreable.Rojo;
import Coloreable.Verde;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightTest {

    @Test
    public void prenderTest() {
        Light lampara= new Light(new Rojo());
        Switch cosito= new Switch();
        Command cmdPrender= new PrenderCommand(lampara);


        assertFalse(lampara.estaPrendida());
        cosito.execute(cmdPrender);
        assertTrue(lampara.estaPrendida());


    }

    @Test
    public void apagar() {
        Light lampara= new Light(new Rojo());
        Switch cosito= new Switch();
        Command cmdPrender= new PrenderCommand(lampara);


        assertFalse(lampara.estaPrendida());
        cosito.execute(cmdPrender);
        assertTrue(lampara.estaPrendida());

        Command cmdApagar= new ApagarCommand(lampara);

        cosito.execute(cmdApagar);
        assertFalse(lampara.estaPrendida());
    }

    public void cambioDeLuzTest(){

        Light light= new Light(new Rojo());

        light.prender();

        light.apagar();

        light.cambiarLuz(new Verde());

        light.prender();

    }
}