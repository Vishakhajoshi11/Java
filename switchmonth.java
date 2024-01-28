public class switchmonth {
    public static void main(String args[])
    {
        int month =7;
        String MonthString="";
        switch(month)
    {
        case 1: MonthString ="1-Jan";
        break;
        case 2: MonthString ="2=Feb";
        break;
        case 3: MonthString ="3-March";
        break;
        case 4: MonthString ="4-April";
        break;
        case 5: MonthString ="5-May";
        break;
        case 6: MonthString ="6-June";
        break;
        case 7: MonthString ="7-July";
        break;
        case 8: MonthString ="8=Aug";
        break;
        case 9: MonthString ="9-Sep";
        break;
        case 10: MonthString ="10-Oct";
        break;
        case 11: MonthString ="11-Nov";
        break;
        case 12: MonthString ="12-dec";
        break;
        default:System.out.println("Invalid");
    }
    System.out.println(MonthString);
    }
    
}
