public class DressingDecorator  extends  SandwichDecorator{

    DressingDecorator(Sandwich sandwich){
        super(sandwich);
    }

    public String make() {
        return sandwich.make() + addDressing() ;
    }

    private String addDressing(){
        return " Added Greens with added chees";
    }
}
