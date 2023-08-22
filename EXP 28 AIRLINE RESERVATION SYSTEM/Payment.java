
import java.util.*;


/**
 * Class Payment
 */
public class Payment {

  //
  // Fields
  //

  public int id;
  public int amount;
  public String date;
  
  //
  // Constructors
  //
  public Payment () { };
  
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
   * Set the value of amount
   * @param newVar the new value of amount
   */
  public void setAmount (int newVar) {
    amount = newVar;
  }

  /**
   * Get the value of amount
   * @return the value of amount
   */
  public int getAmount () {
    return amount;
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
  protected void calculate()
  {
  }


}
