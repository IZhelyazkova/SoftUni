package pb_forth_moreexercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());

        int examineTotal = 0;
        int notExamineTotal = 0;
        int patiance = 0;
        int docktors = 7;

        for (int i = 1; i <= days; i++) {
            int examine = 0;
            int notExamine = 0;
            patiance = Integer.parseInt(scan.nextLine());
            if (i % 3 == 0) {
                if (examineTotal < notExamineTotal) {
                    docktors++;
                }
            }
            if (patiance > docktors) {
                examine = docktors;
                notExamine = patiance - docktors;
                examineTotal = examineTotal + examine;
                notExamineTotal = notExamineTotal + notExamine;
            } else {
                examineTotal = examineTotal + patiance;
            }

            }

        System.out.printf("Treated patients: %d.\nUntreated patients: %d.", examineTotal, notExamineTotal);
    }
}
