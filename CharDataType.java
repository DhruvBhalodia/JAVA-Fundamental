public class CharDataType {
    public static void main(String[] args) {
        char c = 'a'; // ASCII values : a ... z = {97 ... 122}
        char ch = 97; // ASCII values : A ... Z = {65 ... 90}
        char num = 48; //ASCII values : 0 ... 9 = {48 ... 57}
        System.out.println(c + " " + ch + " " + num);
        //JAVA prefers UNICODE rather than ASCII value
        //char Data Type use 2 bytes of memory because of UNICODE where in C it takes only 1 byte (ASCII System)
    }
}
