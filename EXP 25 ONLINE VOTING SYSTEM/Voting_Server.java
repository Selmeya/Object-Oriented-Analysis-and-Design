
import java.util.*;


/**
 * Class Voting_Server
 */
public class Voting_Server {

  //
  // Fields
  //

  public void Voter_ID;
  public void Candidate_ID;
  public void Timestamp;
  public void Votes_Count;
  
  //
  // Constructors
  //
  public Voting_Server () { };
  
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
   * Set the value of Candidate_ID
   * @param newVar the new value of Candidate_ID
   */
  public void setCandidate_ID (void newVar) {
    Candidate_ID = newVar;
  }

  /**
   * Get the value of Candidate_ID
   * @return the value of Candidate_ID
   */
  public void getCandidate_ID () {
    return Candidate_ID;
  }

  /**
   * Set the value of Timestamp
   * @param newVar the new value of Timestamp
   */
  public void setTimestamp (void newVar) {
    Timestamp = newVar;
  }

  /**
   * Get the value of Timestamp
   * @return the value of Timestamp
   */
  public void getTimestamp () {
    return Timestamp;
  }

  /**
   * Set the value of Votes_Count
   * @param newVar the new value of Votes_Count
   */
  public void setVotes_Count (void newVar) {
    Votes_Count = newVar;
  }

  /**
   * Get the value of Votes_Count
   * @return the value of Votes_Count
   */
  public void getVotes_Count () {
    return Votes_Count;
  }

  //
  // Other methods
  //

  /**
   */
  public void Send_Report()
  {
  }


  /**
   */
  public void Count_Votes()
  {
  }


}
