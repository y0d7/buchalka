public class MainSection6_ex25 {
    public static void main(String[] args) {

        //     System.out.println(getDigitCount(0));
        System.out.println(canPack(2, 1, 5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int BIG_WEIGHT = 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

}