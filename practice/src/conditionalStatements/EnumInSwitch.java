package conditionalStatements;
public class EnumInSwitch {

    public enum Day {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String args[]) {

        Day[] daysOfWeek = Day.values();

        for (Day today : daysOfWeek) {

            //Using Enum in Switch case statement

            switch (today) {
                case MONDAY:
                    System.out.println("Today is Monday learn example of How to use Java Enum in Switch");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday, apply Enum in Switch just link primitive int");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday, I confirm Java Enum can be used in Switch case");
                    break;
                case THURSDAY:
                    System.out.println("Thursday, Java Enum values() method return all enum in an array");
                    break;
                case FRIDAY:
                    System.out.println("Friday, Enum can also be used in case statement");
                    break;
                case SATURDAY:
                    System.out.println("Saturday, Enum in Java are compile time constant");
                    break;
                case SUNDAY:
                    System.out.println("Sunday, Using Enum in Switch is very easy");
                    break;

            }
        }
    }
}


