package section3;

public class E19 {
    public static void e19_challange() {
        int myMinIntValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        short firstShort = 1;
        int firstInteger = 2;
        byte firstByte = 1, secondByte = 2;

        int myTotal = (myMinIntValue / 2);

        System.out.println(myTotal);

        byte myMinByteValue = Byte.MIN_VALUE;

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);
    }
}
