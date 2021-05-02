public class SandwichStore {
    public static void main(String[] args){

        //Get plain vannila sandwich
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new VannilaSandwich()));
        System.out.println(sandwich.make());
    }
}
