package pb_first_lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        String Fname;
        String LName;
        int age;
        String town;
        Scanner scan = new Scanner(System.in);
        Fname = scan.nextLine();
        LName = scan.nextLine();
        age = Integer.parseInt(scan.nextLine());
        town = scan.nextLine();
        System.out.println("You are "+Fname+" "+LName+ ", a "+age+"-years old person from "+town+".");
    }
}
