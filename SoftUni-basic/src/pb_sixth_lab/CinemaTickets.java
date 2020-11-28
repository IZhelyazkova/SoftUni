package pb_sixth_lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieName = "";
        int seats = 0;
        int students = 0;
        int standards = 0;
        int kids = 0;
        int count = 0;

        while (!movieName.equals("Finish")) {
            movieName = scan.nextLine();
            if (movieName.equals("Finish")) {
                break;
            } else {
                seats = Integer.parseInt(scan.nextLine());
                String type = "";
                while (!type.equals("End")) {
                    for (int i = 1; i <= seats; i++) {
                        type = scan.nextLine();
                        if (type.equals("End")) {
                            break;
                        } else if (type.equals("student")) {
                            students++;
                        } else if (type.equals("standard")) {
                            standards++;
                        } else {
                            kids++;
                        }
                        count++;
                    }
                    type = "End";
                }
                System.out.printf("%s - %.2f%% full.\n", movieName, ((double) count / seats * 100));
                count = 0;
                if (type.equals("Finish")) {
                    movieName = "Finish";
                }
            }
        }
        int total = kids + standards + students;
        System.out.printf("Total tickets: %d\n", (total));
        System.out.printf("%.2f%% student tickets.\n", (double) students / total * 100);
        System.out.printf("%.2f%% standard tickets.\n", (double) standards / total * 100);
        System.out.printf("%.2f%% kids tickets.", (double) kids / total * 100);
    }
}
