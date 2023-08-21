

/**
 * Class Admin_Authentication
 */
public class Admin_Authentication {

  //
  // Fields
  //

  private Int Pending_Applications;
  private Int Dispatched_Passports;
  private String Application_ID;
  
  //
  // Constructors
  //
  public Admin_Authentication () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Pending_Applications
   * @param newVar the new value of Pending_Applications
   */
  private void setPending_Applications (Int newVar) {
    Pending_Applications = newVar;
  }

  /**
   * Get the value of Pending_Applications
   * @return the value of Pending_Applications
   */
  private Int getPending_Applications () {
    return Pending_Applications;
  }

  /**
   * Set the value of Dispatched_Passports
   * @param newVar the new value of Dispatched_Passports
   */
  private void setDispatched_Passports (Int newVar) {
    Dispatched_Passports = newVar;
  }

  /**
   * Get the value of Dispatched_Passports
   * @return the value of Dispatched_Passports
   */
  private Int getDispatched_Passports () {
    return Dispatched_Passports;
  }

  /**
   * Set the value of Application_ID
   * @param newVar the new value of Application_ID
   */
  private void setApplication_ID (String newVar) {
    Application_ID = newVar;
  }

  /**
   * Get the value of Application_ID
   * @return the value of Application_ID
   */
  private String getApplication_ID () {
    return Application_ID;
  }

  //
  // Other methods
  //

  /**
   */
  public void process()
  {
  }


}
