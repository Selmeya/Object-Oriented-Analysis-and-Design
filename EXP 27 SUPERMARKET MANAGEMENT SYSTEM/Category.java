
import java.util.*;


/**
 * Class CATEGORY
 */
public class CATEGORY {

  //
  // Fields
  //

  public Integer ID;
  public Category Name;
  public Image Image;
  private String Description;
  
  //
  // Constructors
  //
  public CATEGORY () { };
  
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
   * Set the value of Name
   * @param newVar the new value of Name
   */
  public void setName (Category newVar) {
    Name = newVar;
  }

  /**
   * Get the value of Name
   * @return the value of Name
   */
  public Category getName () {
    return Name;
  }

  /**
   * Set the value of Image
   * @param newVar the new value of Image
   */
  public void setImage (Image newVar) {
    Image = newVar;
  }

  /**
   * Get the value of Image
   * @return the value of Image
   */
  public Image getImage () {
    return Image;
  }

  /**
   * Set the value of Description
   * @param newVar the new value of Description
   */
  private void setDescription (String newVar) {
    Description = newVar;
  }

  /**
   * Get the value of Description
   * @return the value of Description
   */
  private String getDescription () {
    return Description;
  }

  //
  // Other methods
  //

}
