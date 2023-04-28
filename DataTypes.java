class DataTypes {
    //Premitive and Non Premitive
    public static void main(String[] args) {
        //Premitive Datatypes
        byte firstVariable = 127; //max size of byte datatype : 127 (2^7 - 1)
        //byte : 1 byte
        short second = 32767; //max size of byte datatype : 32767 (2^15 - 1)
        //short : 2 bytes
        int thrd = 2147483647; //max size of int datatype : 2147483647 (2^31 - 1)
        //int : 4 bytes
        long frth = 9223372036854775807l; //max size of long datatype : 9223372036854775807 (2^63 - 1)
        //long : 8 bytes
        //without l or L long stores only upto 2^31 - 1
        System.out.println(firstVariable);
        System.out.println(second);
        System.out.println(thrd);
        System.out.println(frth);
        float a = 45.12345f; //valid till 5 decimal points
        double b = 45.12345678; //valid till 8 decimal points
        System.out.println(a);
        System.out.println(b);
    }
}
