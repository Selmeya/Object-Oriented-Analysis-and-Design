
import java.util.*;


/**
 * Class Reservation
 */
public class Reservation {

  //
  // Fields
  //

  public int id;
  public String details;
  public String ticketnumber;
  public String date;
  
  //
  // Constructors
  //
  public Reservation () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

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
   * Set the value of ticketnumber
   * @param newVar the new value of ticketnumber
   */
  public void setTicketnumber (String newVar) {
    ticketnumber = newVar;
  }

  /**
   * Get the value of ticketnumber
   * @return the value of ticketnumber
   */
  public String getTicketnumber () {
    return ticketnumber;
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

  //
  // Other methods
  //

  /**
   */
  public void update()
  {
  }


}
