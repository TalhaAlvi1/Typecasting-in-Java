public class Typecasting {
    public static void main(String[] args) {
        // Widening Primitive Type Casting (Implicit)
        byte b = 10;
        short s = b; // byte to short
        int i = s; // short to int
        long l = i; // int to long
        float f = l; // long to float
        double d = f; // float to double

        System.out.println("Byte value " + b);
        System.out.println("Short value " + s);
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
        System.out.println("Double value " + d);

        // Narrowing Primitive Type Casting (Explicit)
        double doub = 10.5;
        float flo = (float) doub; // double to float
        long lon = (long) flo; // float to long
        int in = (int) lon; // long to int
        short sho = (short) in; // int to short
        byte by = (byte) sho; // short to byte

        System.out.println("Double value " + doub);
        System.out.println("Float value " + flo);
        System.out.println("Long value " + lon);
        System.out.println("Int value " + in);
        System.out.println("Short value " + sho);
        System.out.println("Byte value " + by);
    }
}
