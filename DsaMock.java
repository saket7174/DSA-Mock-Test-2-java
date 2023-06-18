public class  DsaMock  {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; 

            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x)); // Output: 2

        x = 8;
        System.out.println(mySqrt(x)); // Output: 2
    }
}

