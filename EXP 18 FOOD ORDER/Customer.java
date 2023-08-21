
import java.util.*;


/**
 * Class Customer
 */
public class Customer {

  //
  // Fields
  //

  public Integer ID;
  protected encrypted Password;
  
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
   * Set the value of ID
   * @param newVar the new value of ID
   */
  public void setID (Integer newVar) {
    ID = newVar;
  }

  /**
   * Get the value of ID
   * @return the value of ID
   */
  public Integer getID () {
    return ID;
  }

  /**
   * Set the value of Password
   * @param newVar the new value of Password
   */
  protected void setPassword (encrypted newVar) {
    Password = newVar;
  }

  /**
   * Get the value of Password
   * @return the value of Password
   */
  protected encrypted getPassword () {
    return Password;
  }

  //
  // Other methods
  //

  /**
   */
  public void Login()
  {
  }


  /**
   */
  public void Select_Restaurant()
  {
  }


  /**
   */
  public void Place_Order_and_Menu_CArd()
  {
  }


  /**
   */
  public void Payment()
  {
  }


}
