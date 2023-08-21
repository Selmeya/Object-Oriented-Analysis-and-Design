
import java.util.*;


/**
 * Class Subject
 */
public class Subject {

  //
  // Fields
  //

  public String name;
  protected int id;
  private String description;
  private String instructor;
  private String schedule;
  
  //
  // Constructors
  //
  public Subject () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  protected void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  protected int getId () {
    return id;
  }

  /**
   * Set the value of description
   * @param newVar the new value of description
   */
  private void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  private String getDescription () {
    return description;
  }

  /**
   * Set the value of instructor
   * @param newVar the new value of instructor
   */
  private void setInstructor (String newVar) {
    instructor = newVar;
  }

  /**
   * Get the value of instructor
   * @return the value of instructor
   */
  private String getInstructor () {
    return instructor;
  }

  /**
   * Set the value of schedule
   * @param newVar the new value of schedule
   */
  private void setSchedule (String newVar) {
    schedule = newVar;
  }

  /**
   * Get the value of schedule
   * @return the value of schedule
   */
  private String getSchedule () {
    return schedule;
  }

  //
  // Other methods
  //

  /**
   */
  public void new_operation()
  {
  }


}
