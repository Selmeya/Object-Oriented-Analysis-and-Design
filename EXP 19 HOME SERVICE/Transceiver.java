
import java.util.*;


/**
 * Class Transceiver
 */
public class Transceiver {

  //
  // Fields
  //

  private String alert_msg;
  private String command;
  
  //
  // Constructors
  //
  public Transceiver () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of alert_msg
   * @param newVar the new value of alert_msg
   */
  private void setAlert_msg (String newVar) {
    alert_msg = newVar;
  }

  /**
   * Get the value of alert_msg
   * @return the value of alert_msg
   */
  private String getAlert_msg () {
    return alert_msg;
  }

  /**
   * Set the value of command
   * @param newVar the new value of command
   */
  private void setCommand (String newVar) {
    command = newVar;
  }

  /**
   * Get the value of command
   * @return the value of command
   */
  private String getCommand () {
    return command;
  }

  //
  // Other methods
  //

  /**
   */
  public void receive_command()
  {
  }


  /**
   */
  public void send_alert()
  {
  }


}
