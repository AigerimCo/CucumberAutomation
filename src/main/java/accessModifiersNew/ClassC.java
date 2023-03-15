package accessModifiersNew;
import accessModifiers.Food;

public class ClassC extends Food{
    public ClassC(){
        super("salad", 10.2, true);
    }

    public static void main(String[] args) {
        ClassC c = new ClassC();
        String f = c.foodName;
    }
}
