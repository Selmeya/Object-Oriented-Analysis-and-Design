

/**
 * Class User
 */
public class User extends New_User, Registered_User {

  //
  // Fields
  //

  private String Login_ID;
  private String Password;
  
  //
  // Constructors
  //
  public User () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Login_ID
   * @param newVar the new value of Login_ID
   */
  private void setLogin_ID (String newVar) {
    Login_ID = newVar;
  }

  /**
   * Get the value of Login_ID
   * @return the value of Login_ID
   */
  private String getLogin_ID () {
    return Login_ID;
  }

  /**
   * Set the value of Password
   * @param newVar the new value of Password
   */
  private void setPassword (String newVar) {
    Password = newVar;
  }

  /**
   * Get the value of Password
   * @return the value of Password
   */
  private String getPassword () {
    return Password;
  }

  //
  // Other methods
  //

  /**
   */
  public void displayDetails()
  {
  }


}
