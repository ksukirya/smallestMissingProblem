public class smallestMissingProblem {

    public static void main(String[] args) {
        int[] num4 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] num3 = {0, 1, 2, 3, 4, 6, 7, 8};
        int[] num2 = {1, 2, 3, 4, 6, 7, 8};
        int[] num1 = {0, 1, 2, 5, 8, 11, 32};
        smallestMissing(num1);
        System.out.println(smallestMissingBs(num1));
        System.out.println("");
        smallestMissing(num2);
        System.out.println(smallestMissingBs(num2));
        System.out.println("");
        smallestMissing(num3);
        System.out.println(smallestMissingBs(num3));
        System.out.println("");
        smallestMissing(num4);
        System.out.println(smallestMissingBs(num4));
        System.out.println("");
    }

    public static void smallestMissing(int[] num) {
        // for loop to iterate through the length of the array
        // compares the index i to the element of the array and prints out the first
        // mismatch
        for (int i = 0; i < num.length; i++) {
            if (num[i] != i) {
                System.out.println("The first missing element is " + i + ".");
                break;
                // if the first element is not within the bounds of the given array, the length
                // of the array -1 is printed
            } else if (num[i] == num.length - 1) {
                System.out.println("The first missing element is " + num.length + ".");
            }
        }
    }

    public static int smallestMissingBs(int[] num) {
        int size = num.length;
        int a = 0, b = size - 1;
        int mid = 0;
        while ((b - a) > 1) {
            if (num[0] != 0){
                System.out.print("BS The first missing element is ");
                return 0;
            }
            else if (num[size-1] != (size)){
                System.out.print("BS The first missing element is ");
                return size;
            }
            mid = (a + b) / 2;
            if ((num[a] - a) != (num[mid] - mid))
            b = mid;
            else if ((num[b] - b) != (num[mid] - mid))
            a = mid;
        }
        System.out.print("BS The first missing element is ");
        return (num[a] + 1);
        
    }
}