// 2. A method named average() has one argument that is an array of strings. It converts these
// to double values and returns their average. The method generates a NullPointerException
// if a array elements is null or NumberFormatException if an element is incorrectly
// formatted. Write a program that illustrates how to declare and use this method. Include
// throws clause in the method declaration to indicate that these problems can occur.

public class claculateaverage {
    public static Double average(String arr[]) throws NumberFormatException, NullPointerException {
        if (arr == null) {
            throw new NullPointerException("array is Null");
        }
        double sum = 0;
        int count = 0;

        for (String str : arr) {
            if (str == null) {
                throw new NullPointerException("array contains null element");
            }
            double num = Double.parseDouble(str);
            sum = sum + num;
            count++;

        }
        if (count == 0) {
            System.out.println("cant calculate average ");
        }
        return sum / count;

    }

    public static void main(String[] args) {
        String arr[] = { "2.1", "12.3", "123.3" };

        double avvv = average(arr);
        System.out.println("average of String numberss : " + avvv);

    }
}
