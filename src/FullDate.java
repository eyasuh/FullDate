import java.util.Scanner;

public class FullDate {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //prompt user for data
        System.out.print("Enter month(mm): ");
        String month = in.nextLine();
        System.out.print("Enter day(dd): ");
        int day = in.nextInt();
        System.out.print("Enter year(yy): ");
        int year = in.nextInt();
        // use switch statement to check month
        String monthStr ="";
        switch (month) {
            case "01":
                monthStr = "January";
                break;
            case "02":
                monthStr = "February";
                break;
            case "03":
                monthStr = "March";
                break;
            case "04":
                monthStr = "Aril";
                break;
            case "05":
                monthStr = "May";
                break;
            case "06":
                monthStr = "Jun";
                break;
            case "07":
                monthStr = "July";
                break;
            case "08":
                monthStr = "August";
                break;
            case "09":
                monthStr = "September";
                break;
            case "10":
                monthStr = "October";
                break;
            case "11":
                monthStr = "November";
                break;
            case "12":
                monthStr = "December";
                break;
            default:
                monthStr = "Invalid Month";
        }
        //check for correct day input
        String dayStr = "";
        if (day < 0 && day > 31) {
            dayStr = "Invalid date";
        } else dayStr = String.valueOf(day);

        //print the date
        System.out.println("It is " + monthStr + " " + dayStr + ", " + year);



    }

}
