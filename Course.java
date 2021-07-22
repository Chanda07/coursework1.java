public class Course 
{ 
    //defining class attributes
    private String courseID;
    private String course_name;
    private String course_leader;
    private int duration;
    //initializing constructor
    public Course(String courseID, String course_name, int duration) 
    {
        this.courseID = courseID;
        this.course_name = course_name;
        this.duration = duration;
        this.course_leader = "";
    }
    //defining accessor methods
    public String getCourseID() 
    {
        return courseID;
    }

    public String getCourse_name() 
    {
        return course_name;
    }

    public int getDuration() 
    {
        return duration;
    }

    public String getCourse_leader() 
    {
        return course_leader;
    }
    //method to set the course_leader's newname
    public void setCourse_leader(String newname) 
    {
        this.course_leader = newname;
    }
    // method to display all information of the Course
    public void display() 
    {
        if (course_leader != "") {
            System.out.println("The course_leader is:" +course_leader);
        }
        System.out.println("The courseID is:" +courseID);
        System.out.println("The name of the course is:" +course_name);
        System.out.println("The duration is:" +duration);
    }
}
 