
import java.util.*;


/**
 * Class Customer
 */
public class Customer extends Crews {

  //
  // Fields
  //

  public String address;
  public String reservation;
  private String details;
  
  //
  // Constructors
  //
  public Customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of address
   * @param newVar the new value of address
   */
  public void setAddress (String newVar) {
    address = newVar;
  }

  /**
   * Get the value of address
   * @return the value of address
   */
  public String getAddress () {
    return address;
  }

  /**
   * Set the value of reservation
   * @param newVar the new value of reservation
   */
  public void setReservation (String newVar) {
    reservation = newVar;
  }

  /**
   * Get the value of reservation
   * @return the value of reservation
   */
  public String getReservation () {
    return reservation;
  }

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  private void setDetails (String newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  private String getDetails () {
    return details;
  }

  //
  // Other methods
  //

  /**
   */
  public void add()
  {
  }


  /**
   */
  public void update()
  {
  }


}
