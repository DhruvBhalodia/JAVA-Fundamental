public class TypeCasting {
    public static void main(String[] args) {
        int a = 45;
        double b = a; //size of int is less than double
        //Implicite type casting
        a = (int)b; //size of double is greater than int
    }
}
