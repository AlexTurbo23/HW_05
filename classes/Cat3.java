package classes;

public class Cat3 {
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount) {
        Cat3.catsCount = catsCount;

        /*
        implement method that it sets up catsCount to the path parameter of the method
         */
    }
    public static void main(String[] args) {
        setCatsCount(45);
        System.out.println(catsCount);
    }
}
