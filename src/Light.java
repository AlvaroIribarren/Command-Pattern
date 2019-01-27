import Coloreable.Coloreable;

public class Light {

    private boolean encendida;
    private Coloreable color;

    public Light(Coloreable color){
        this.encendida= false;
        this.color= color;

    }

    public void prender(){
        this.encendida= true;
        this.color.colorear();
    }

    public void apagar(){
        this.encendida= false;
    }

    public boolean estaPrendida(){
        return this.encendida;
    }

    public void cambiarLuz(Coloreable nuevoColor){
        this.color= nuevoColor;
    }
}

