public class PrenderCommand implements Command {

    private Light light;

    public PrenderCommand(Light light){
        this.light= light;
    }

    @Override
    public void execute() {
        light.prender();
    }
}
