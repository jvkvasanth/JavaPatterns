public class MeatDecorator extends SandwichDecorator{

    MeatDecorator(Sandwich sandwich){
        super(sandwich);
    }

    public String make(){
        return sandwich.make() + addMeat();
    }

    private String addMeat(){
        return " with Meat";
    }
}
