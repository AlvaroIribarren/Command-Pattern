public class ApagarCommand implements Command {

    private Light light;

    public ApagarCommand(Light light){
        this.light= light;
    }

    @Override
    public void execute() {
        this.light.apagar();
    }
}
