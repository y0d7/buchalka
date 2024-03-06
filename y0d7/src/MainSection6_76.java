public class MainSection6_76 {
    public static void main(String[] args) {
        getBucketCount(3.4, 2.1, 1.5, 2);

    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double remainingArea = area - extraBuckets * areaPerBucket;
        return getBucketCount(remainingArea, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 ||areaPerBucket <= 0 ) {
            return -1;
        }

        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double numberOfBuckets = area / areaPerBucket;
        return (int) Math.ceil(numberOfBuckets);
    }

}