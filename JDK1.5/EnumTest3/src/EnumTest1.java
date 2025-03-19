enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY 
};

public class EnumTest1 {
    Day day;
    
    public EnumTest1(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest1 firstDay = new EnumTest1(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest1 thirdDay = new EnumTest1(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest1 fifthDay = new EnumTest1(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest1 sixthDay = new EnumTest1(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest1 seventhDay = new EnumTest1(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}