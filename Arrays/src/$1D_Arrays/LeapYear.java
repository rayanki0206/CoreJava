package $1D_Arrays;

public class LeapYear {
    public static void main(String[] args) {
        int[] a = {1900, 2012, 1980, 400, 1955, 2024, 2050};

        for (int i = 0; i < a.length; i++) {
            int year = a[i];
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
