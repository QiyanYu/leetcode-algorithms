public class FindSum {
    public static boolean findSum(int[] A, int x) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (A[left] + A[right] == x) {
                return true;
            } else if (A[left] + A[right] < x) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
