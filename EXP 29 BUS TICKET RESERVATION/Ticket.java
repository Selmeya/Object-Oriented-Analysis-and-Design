
import java.util.*;


/**
 * Class Ticket
 */
public class Ticket {

  //
  // Fields
  //

  public Char Source;
  public Char Destination;
  public Date DateOfJourney;
  public Time Time;
  public Char BusNo;
  public Char SeatNo;
  
  //
  // Constructors
  //
  public Ticket () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Source
   * @param newVar the new value of Source
   */
  public void setSource (Char newVar) {
    Source = newVar;
  }

  /**
   * Get the value of Source
   * @return the value of Source
   */
  public Char getSource () {
    return Source;
  }

  /**
   * Set the value of Destination
   * @param newVar the new value of Destination
   */
  public void setDestination (Char newVar) {
    Destination = newVar;
  }

  /**
   * Get the value of Destination
   * @return the value of Destination
   */
  public Char getDestination () {
    return Destination;
  }

  /**
   * Set the value of DateOfJourney
   * @param newVar the new value of DateOfJourney
   */
  public void setDateOfJourney (Date newVar) {
    DateOfJourney = newVar;
  }

  /**
   * Get the value of DateOfJourney
   * @return the value of DateOfJourney
   */
  public Date getDateOfJourney () {
    return DateOfJourney;
  }

  /**
   * Set the value of Time
   * @param newVar the new value of Time
   */
  public void setTime (Time newVar) {
    Time = newVar;
  }

  /**
   * Get the value of Time
   * @return the value of Time
   */
  public Time getTime () {
    return Time;
  }

  /**
   * Set the value of BusNo
   * @param newVar the new value of BusNo
   */
  public void setBusNo (Char newVar) {
    BusNo = newVar;
  }

  /**
   * Get the value of BusNo
   * @return the value of BusNo
   */
  public Char getBusNo () {
    return BusNo;
  }

  /**
   * Set the value of SeatNo
   * @param newVar the new value of SeatNo
   */
  public void setSeatNo (Char newVar) {
    SeatNo = newVar;
  }

  /**
   * Get the value of SeatNo
   * @return the value of SeatNo
   */
  public Char getSeatNo () {
    return SeatNo;
  }

  //
  // Other methods
  //

}
