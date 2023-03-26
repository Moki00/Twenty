import java.util.HexFormat;

public class Hexadecimal {
    /*
    * hexadecimal has a base of 16 digits:
    * 0123456789ABCDEF
    * Goes up by 16^x like this
    * 1 16 256 4096 65536
    * */
    public static void main(String[] args) {
        // 47872 = 0xBB00

        int number = 48000;
        System.out.println(Integer.toHexString(number));
    }

//    public static final String HEXADECIMAL = "0123456789ABCDEF";

}
