package pr20;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("type year, month, day, hour, minute with spaces: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);
        Date date = calendar.getTime();
        System.out.println("formed date is: " + date);


        //2
        String developerName = "Ilya Vanyaev";
        Date taskReceivedDate = new Date(122, 8, 1);
        Date taskSubmittedDate = new Date(122, 11, 31);
        System.out.println("Developer name: " + developerName);
        System.out.println("Task received date: " + taskReceivedDate);
        System.out.println("Task submitted date: " + taskSubmittedDate);


    }
}
