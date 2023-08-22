
import java.util.*;


/**
 * Class Transaction
 */
public class Transaction {

  //
  // Fields
  //

  public String details;
  public String listofdish;
  public String date;
  protected int id;
  
  //
  // Constructors
  //
  public Transaction () { };
  
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
   * Set the value of listofdish
   * @param newVar the new value of listofdish
   */
  public void setListofdish (String newVar) {
    listofdish = newVar;
  }

  /**
   * Get the value of listofdish
   * @return the value of listofdish
   */
  public String getListofdish () {
    return listofdish;
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
  public void add()
  {
  }


  /**
   */
  public void update()
  {
  }


}
