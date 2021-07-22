/* NonAcademicCourse is a subclass of Course class and
 * it expand the class with added attributes 
 */
public class NonAcademicCourse extends Course /* inherits public, private methods and
                                                  attributes from Couse class*/
{
    //defining class attributes
    private String instructor_name;
    private String start_date;
    private String completion_date;
    private String exam_date;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    //initializing constructor
    public NonAcademicCourse(String courseID, String course_name, int duration, String prerequisite) 
    {
        super(courseID, course_name, duration); //calling constructor from parent class
        this.prerequisite = prerequisite;
        this.instructor_name = instructor_name;
        this.start_date = "";
        this.completion_date = ""; 
        this.exam_date = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    //defining accessor method
    public String getInstructor_name()
    {
        return instructor_name;
    }

    public String getStart_date() 
    {
        return start_date;
    }

    public String getCompletion_date() 
    {
        return completion_date;
    }

    public String getExam_date() 
    {
        return exam_date;
    }

    public String getPrerequisite() 
    {
        return prerequisite;
    }

    public boolean getIsRegistered() 
    {
        return isRegistered;
    }

    public boolean getIsRemoved() 
    {
        return isRemoved;
    }
    //method to set insructor_name to newinsrtuctorname
    public void setInstructor_name(String newinstructorname) 
    {
        if (isRegistered==false) {
            instructor_name = newinstructorname;
        }
        else {
            System.out.println("It is not possible to change instructor name.");
        }
    }
    //method to register NonAcademicCourse
    public void registerNonAcademicCourse(String course_leader, String instructor_name, String start_date, String completion_date, String exam_date) 
    {
        if (isRegistered==false) {
            setInstructor_name(instructor_name);
            super.setCourse_leader(course_leader);
            this.start_date = start_date;
            this.completion_date = completion_date;
            this.exam_date = exam_date;
            this.isRegistered = true;
        }
        else {
            System.out.println("The course is already registered:" +isRegistered);
        }
    }
    //method to remove NonAcademicCourse
    public void removeNonAcademicCourse() 
    {
        if (isRemoved==true) { //checking if isRemoved status is true
            System.out.println("The course is removed:" +isRemoved);
        }
        else { 
            super.setCourse_leader("");
            this.instructor_name = "";
            this.start_date = "";
            this.completion_date = "";
            this.exam_date = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }
    //to display the details of NonAcademicCourse
    public void display() 
    {
        super.display(); //calling display from parent class
        if (isRegistered==true) {
            System.out.println("The instructor name is:" +instructor_name);
            System.out.println("The starting date is from:" +start_date);
            System.out.println("The completion date is:" +completion_date);
            System.out.println("The exam date is on:" +exam_date);
        }
        else {
            System.out.println("The course is not registered.");
        }
    }
}

        
  