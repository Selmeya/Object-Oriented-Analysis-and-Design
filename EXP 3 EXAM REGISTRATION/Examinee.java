
import java.util.*;


/**
 * Class Examinee
 */
public class Examinee extends Accounts {

  //
  // Fields
  //

  public String course;
  public int year;
  public int accountnum;
  
  //
  // Constructors
  //
  public Examinee () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of course
   * @param newVar the new value of course
   */
  public void setCourse (String newVar) {
    course = newVar;
  }

  /**
   * Get the value of course
   * @return the value of course
   */
  public String getCourse () {
    return course;
  }

  /**
   * Set the value of year
   * @param newVar the new value of year
   */
  public void setYear (int newVar) {
    year = newVar;
  }

  /**
   * Get the value of year
   * @return the value of year
   */
  public int getYear () {
    return year;
  }

  /**
   * Set the value of accountnum
   * @param newVar the new value of accountnum
   */
  public void setAccountnum (int newVar) {
    accountnum = newVar;
  }

  /**
   * Get the value of accountnum
   * @return the value of accountnum
   */
  public int getAccountnum () {
    return accountnum;
  }

  //
  // Other methods
  //

  /**
   */
  public void update()
  {
  }


}
