package ca.sheridancollege.week1.softwarefundamentals;

public class StudentDemo 
{
  private String studentID;
  private String name;
  
  /**
   * A constructor to pass in the given ID and then name
   * @param givenID - the ID to assign
   * @param givenName- the name to assign 
   */
  public StudentDemo(String givenID, String givenName)
  {
      studentID = givenID;
      name = givenName;
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
    
}
