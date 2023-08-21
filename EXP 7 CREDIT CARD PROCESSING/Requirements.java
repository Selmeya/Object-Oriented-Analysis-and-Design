
import java.util.*;


/**
 * Class Requirements
 */
public class Requirements {

  //
  // Fields
  //

  public String Name;
  public text details;
  private int Code;
  
  //
  // Constructors
  //
  public Requirements () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Name
   * @param newVar the new value of Name
   */
  public void setName (String newVar) {
    Name = newVar;
  }

  /**
   * Get the value of Name
   * @return the value of Name
   */
  public String getName () {
    return Name;
  }

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  public void setDetails (text newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  public text getDetails () {
    return details;
  }

  /**
   * Set the value of Code
   * @param newVar the new value of Code
   */
  private void setCode (int newVar) {
    Code = newVar;
  }

  /**
   * Get the value of Code
   * @return the value of Code
   */
  private int getCode () {
    return Code;
  }

  //
  // Other methods
  //

  /**
   */
  public void scan()
  {
  }


  /**
   */
  public void upload()
  {
  }


  /**
   */
  public void print()
  {
  }


}
