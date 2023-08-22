
import java.util.*;


/**
 * Class Airline_Ticket
 */
public class Airline_Ticket {

  //
  // Fields
  //

  public String number;
  public String details;
  public String price;
  private int id;
  
  //
  // Constructors
  //
  public Airline_Ticket () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of number
   * @param newVar the new value of number
   */
  public void setNumber (String newVar) {
    number = newVar;
  }

  /**
   * Get the value of number
   * @return the value of number
   */
  public String getNumber () {
    return number;
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
   * Set the value of price
   * @param newVar the new value of price
   */
  public void setPrice (String newVar) {
    price = newVar;
  }

  /**
   * Get the value of price
   * @return the value of price
   */
  public String getPrice () {
    return price;
  }

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  private void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  private int getId () {
    return id;
  }

  //
  // Other methods
  //

  /**
   */
  public void calculate()
  {
  }


  /**
   */
  public void update()
  {
  }


}
