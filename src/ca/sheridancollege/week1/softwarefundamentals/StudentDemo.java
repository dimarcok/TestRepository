package ca.sheridancollege.week1.softwarefundamentals;

public class StudentDemo 
{
  private String studentID;
  private String name;
  private String program;
  private int maxCourses = 3;
  
  /**
   * A constructor to pass in the given ID and then name
   * @param givenID - the ID to assign
   * @param givenName- the name to assign 
   * @param maxCourses- max number of courses
   */
  public StudentDemo(String givenID, String givenName, int maxCourses)
  {
      studentID = givenID;
      name = givenName;
      this.maxCourses = maxCourses;
  }
  
  /**
   * A method to set the student ID
   * @param givenID the ID to set
   */
  public void setStudentID(String givenID)
  {
      studentID=givenID;
  }
  /**
   * An accessor method for studentID
   * @return the student's ID 
   */
  public String getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    public int getMaxCourses() {
        return maxCourses;
    }
    
    public void setMaxCourses(int maxCourses) {
        this.maxCourses = maxCourses;
    }
}
