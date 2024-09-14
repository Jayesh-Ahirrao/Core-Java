public class Main {
    public static void main(String[] args) {
        Box boxes[] = new Box[3];
        int len = 1;

        /*
         * // b is a loop variable which copies values or ref of elements of array
         * // hence changes made from b will not reflect in original array
         * for (Box b : boxes) {
         * b = new Box(len, len, len);
         * len++;
         * }
         */

        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box(len, len, len++);
        }

        for (Box b : boxes) {
            System.out.println(b.calVolume());
        }
    }
}

// for (int i=0;i<boxes.length;i++) {
// boxes[i]= new Box(len, len, len);
// len++;
// }
