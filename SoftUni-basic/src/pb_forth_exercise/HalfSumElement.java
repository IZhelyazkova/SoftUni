package pb_forth_exercise;

import java.util.*;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List array = new ArrayList<Integer>();
        int number = 0;
        int sum = 0;
        int keep = 0;
        boolean it = false;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scan.nextLine());
            array.add(number);
            sum = sum + number;
        }
        for (int i = 0; i < array.size(); i++) {
            int num = sum - (int) array.get(i);
            if (num == (int) array.get(i)) {
                keep = sum - (int) array.get(i);
                it = true;
            }
        }
        if (it == true) {
            System.out.printf("Yes\nSum = %d", keep);
        }else{
//            System.out.println((int)Collections.max(array));
            System.out.printf("No\nDiff = %d", Math.abs((int)Collections.max(array)-(sum-(int)Collections.max(array))));
        }
    }
}
