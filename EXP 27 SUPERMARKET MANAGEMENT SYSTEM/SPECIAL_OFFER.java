
import java.util.*;


/**
 * Class SPECIAL_OFFER
 */
public class SPECIAL_OFFER {

  //
  // Fields
  //

  public String Name;
  public DateTime ValidFrom;
  public DateTime ValidTo;
  
  //
  // Constructors
  //
  public SPECIAL_OFFER () { };
  
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
   * Set the value of ValidFrom
   * @param newVar the new value of ValidFrom
   */
  public void setValidFrom (DateTime newVar) {
    ValidFrom = newVar;
  }

  /**
   * Get the value of ValidFrom
   * @return the value of ValidFrom
   */
  public DateTime getValidFrom () {
    return ValidFrom;
  }

  /**
   * Set the value of ValidTo
   * @param newVar the new value of ValidTo
   */
  public void setValidTo (DateTime newVar) {
    ValidTo = newVar;
  }

  /**
   * Get the value of ValidTo
   * @return the value of ValidTo
   */
  public DateTime getValidTo () {
    return ValidTo;
  }

  //
  // Other methods
  //

}
