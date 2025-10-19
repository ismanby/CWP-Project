package condition1;

public class DayOfWeek {
    public String getDayName(int day) {
        String dayName;
        switch (day) {
            // jika day 1, maka dayName = "Monday"
            case 1:
                dayName = "Monday";
                break;
            // jika day 2, maka dayName = "Tuesday" 
            case 2:
                dayName = "Tuesday";
                break;
            // jika day 3, maka dayName = "Wednesday"
            case 3:
                dayName = "Wednesday";
                break;
            // jika day 4, maka dayName = "Thursday"
            case 4:
                dayName = "Thursday";
                break;
            // jika day 5, maka dayName = "Friday"
            case 5:
                dayName = "Friday";
                break;
            // jika day 6, maka dayName = "Saturday"
            case 6:
                dayName = "Saturday";
                break;
            // jika day 7, maka dayName = "Sunday"
            case 7:
                dayName = "Sunday";
                break;
            // selain 1-7, maka dayName = "Unknown"
            default:
                dayName = "Unknown";
        }
        // mengembalikan nilai dayName dengan format "Day: <dayName>"
        return "Day: " + dayName;
    }
}
