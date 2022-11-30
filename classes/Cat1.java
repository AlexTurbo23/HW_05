package classes;
import java.util.Arrays;

public class Cat1 {

    private String name;
    int weight;
    int age;


    public void setName(String name) {
                this.name = name;
         /*
        Implement this method that it can set up class field name
         */
    }
    public static void main(String[] args)
        {
            Cat1 cat1 = new Cat1();
            cat1.setName("Markiz");
            System.out.println(cat1);
        }
}
