
import java.util.*;


/**
 * Class Crews
 */
public class Crews {

  //
  // Fields
  //

  public String name;
  public String age;
  public String contactnum;
  protected int id;
  private String username;
  private String password;
  
  //
  // Constructors
  //
  public Crews () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of age
   * @param newVar the new value of age
   */
  public void setAge (String newVar) {
    age = newVar;
  }

  /**
   * Get the value of age
   * @return the value of age
   */
  public String getAge () {
    return age;
  }

  /**
   * Set the value of contactnum
   * @param newVar the new value of contactnum
   */
  public void setContactnum (String newVar) {
    contactnum = newVar;
  }

  /**
   * Get the value of contactnum
   * @return the value of contactnum
   */
  public String getContactnum () {
    return contactnum;
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

  /**
   * Set the value of username
   * @param newVar the new value of username
   */
  private void setUsername (String newVar) {
    username = newVar;
  }

  /**
   * Get the value of username
   * @return the value of username
   */
  private String getUsername () {
    return username;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  private void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  private String getPassword () {
    return password;
  }

  //
  // Other methods
  //

  /**
   */
  public void create()
  {
  }


  /**
   */
  public void update()
  {
  }


}
