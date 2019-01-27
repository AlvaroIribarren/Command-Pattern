import Coloreable.Rojo;
import Coloreable.Verde;

public class Main {

    public static void main(String[] args) {

        Light light= new Light(new Rojo());

        light.prender();

        light.apagar();

        light.cambiarLuz(new Verde());

        light.prender();
    }
}
