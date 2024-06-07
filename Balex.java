
        
        public class Balex {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String courselD = "";
        try {
            courselD = args[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong CourselD details");
            return;
        }
        String courseID = "";
        int tuition = 0;
        double amountDue = 0;

        // Look up the CourseID and Tuition based on the CourselD entered
        // by the user
        switch (courselD) {
            case "BSE" -> {
                courseID = "Software Engineering";
                tuition = 900000;
            }
            case "BIT" -> {
                courseID = "Information Technology";
                tuition = 750000;
            }
            case "BCS" -> {
                courseID = "Computer Science";
                tuition = 800000;
            }
            case "BCE" -> {
                courseID = "Computer Engineering";
                tuition = 950000;
            }
            default -> {
                System.out.println("Wrong CourselD details");
                return;
            }
        }

        // Check if the tuition amount is 0
        if (tuition == 0) {
            System.out.println("Tuition amount is 0");
            return;
        }

        // Calculate the amount due
        amountDue = tuition * 0.75; // Reduce tuition by 25%

        // Print the details for the course
        System.out.println("Course Information");
        System.out.println("--------------------------------");
        System.out.println("Course ID: " + courseID);
        System.out.println("Tuition: " + tuition);
        System.out.println("Amount Due: " + amountDue);
        System.out.println("Course Full Name: ");

        System.out.println("Hello World!");
    }
}
