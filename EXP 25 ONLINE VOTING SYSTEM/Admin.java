
import java.util.*;


/**
 * Class Admin
 */
public class Admin extends Voter_Profile {

  //
  // Fields
  //

  public void Voter_ID;
  public void Vote_No;
  
  //
  // Constructors
  //
  public Admin () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Voter_ID
   * @param newVar the new value of Voter_ID
   */
  public void setVoter_ID (void newVar) {
    Voter_ID = newVar;
  }

  /**
   * Get the value of Voter_ID
   * @return the value of Voter_ID
   */
  public void getVoter_ID () {
    return Voter_ID;
  }

  /**
   * Set the value of Vote_No
   * @param newVar the new value of Vote_No
   */
  public void setVote_No (void newVar) {
    Vote_No = newVar;
  }

  /**
   * Get the value of Vote_No
   * @return the value of Vote_No
   */
  public void getVote_No () {
    return Vote_No;
  }

  //
  // Other methods
  //

  /**
   */
  public void Submit_report()
  {
  }


}
