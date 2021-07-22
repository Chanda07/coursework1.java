/* AcademicCourse is a subclass of Course class and
 * it expand the class with added attributes
 */
public class AcademicCourse extends Course /* inherits methods and variables
                                             from Course class */
{
    //defining class attributes
    private String lecturer_name;
    private String level;
    private String credit;
    private String starting_date;
    private String completion_date;
    private int numberOfAssessments;
    private boolean isRegistered;
    //initializing constructor
    public AcademicCourse(String courseID, String course_name, int duration, String level, String credit, int numberOfAssessments) 
    {
        super(courseID, course_name, duration);  //calling constructor from parent class
        this.lecturer_name = "";
        this.level = level;
        this.credit = credit;
        this.starting_date = ""; 
        this.completion_date = "";
        this.numberOfAssessments = numberOfAssessments;
        this.isRegistered = false;
    }
    //defining accessor methods
    public String getLecturer_name() {
        return lecturer_name;
    }

    public String getLevel() {
        return level;
    }

    public String getCredit() {
        return credit;
    }

    public String getStarting_date() {
        return starting_date;
    }

    public String getCompletion_date() {
        return completion_date;
    }

    public int getNumberOfAssessments() {
        return numberOfAssessments;
    }

    public boolean getIsRegistered() {
        return isRegistered;
    }
    //method to set lecturer_name to lecturers
    public void setLecturer_name(String lecturers) {
        this.lecturer_name = lecturers;
    }
    //method to set numberofassessments to newnumberofassessments
    public void setNumberOfAssessments(int newnumberOfAssessments) {
        this.numberOfAssessments = newnumberOfAssessments;
    }
    //method to register a particular AcademicCourse
    public void registerAcademicCourse(String course_leader, String lecturer_name, String starting_date, String completion_date) 
    {
        if (isRegistered==true) { //if the AcademicCourse is already registered then display lecturer_name,starting_date,completion_date
            System.out.println("The course is already registered.");
            System.out.println("The lecturer name is:" +lecturer_name);
            System.out.println("The starting date is:" +starting_date);
            System.out.println("The completion date is:" +completion_date);
        }
        else { //if the AcademicCourse is not registered then set the course_leader name from parent class
            super.setCourse_leader(course_leader);
            this.lecturer_name = lecturer_name;
            this.starting_date = starting_date;
            this.completion_date = completion_date;
            this.isRegistered = true;
        }
    }
    //method to display all the information of AcademicCourse
    public void display() 
    {
        super.display(); //calling display method from parent class
        if (isRegistered==true) {
            System.out.println("The lecturer name is:" +lecturer_name);
            System.out.println("Level:" +level);
            System.out.println("Credit:" +credit);
            System.out.println("The starting date is from:" +starting_date);
            System.out.println("The completion date is:" +completion_date);
            System.out.println("The number of assessments is:" +numberOfAssessments);
        }
    }
}

    
    
        
    

