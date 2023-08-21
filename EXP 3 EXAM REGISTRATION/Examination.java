
import java.util.*;


/**
 * Class Examination
 */
public class Examination {

  //
  // Fields
  //

  public String details;
  public String date;
  protected int id;
  
  //
  // Constructors
  //
  public Examination () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  public void setDetails (String newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  public String getDetails () {
    return details;
  }

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  public void setDate (String newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  public String getDate () {
    return date;
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

  //
  // Other methods
  //

  /**
   */
  public void calculateScore()
  {
  }


}
