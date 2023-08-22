
import java.util.*;


/**
 * Class Refund
 */
public class Refund {

  //
  // Fields
  //

  public Float Amount;
  private Char Customer_Id;
  
  //
  // Constructors
  //
  public Refund () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Amount
   * @param newVar the new value of Amount
   */
  public void setAmount (Float newVar) {
    Amount = newVar;
  }

  /**
   * Get the value of Amount
   * @return the value of Amount
   */
  public Float getAmount () {
    return Amount;
  }

  /**
   * Set the value of Customer_Id
   * @param newVar the new value of Customer_Id
   */
  private void setCustomer_Id (Char newVar) {
    Customer_Id = newVar;
  }

  /**
   * Get the value of Customer_Id
   * @return the value of Customer_Id
   */
  private Char getCustomer_Id () {
    return Customer_Id;
  }

  //
  // Other methods
  //

  /**
   */
  public void RefundAmount()
  {
  }


}
