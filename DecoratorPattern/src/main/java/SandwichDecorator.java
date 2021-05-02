public abstract  class SandwichDecorator implements  Sandwich {

    Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public String make(){
        return sandwich.make();
    }
}
