package project.Models;

public class AirplanePilot extends Employee {

  private String License;
  private int FlightHours;

  public AirplanePilot(int ID, String Name, String Address, String Contact, int NumberEmp, String HiringDate, String Role, String License, int FlightHours) {
    
    super(ID, Name, Address, Contact, NumberEmp, HiringDate, Role);
    this.License = License;
    this.FlightHours = FlightHours;
}


  public void assignFlight() {
  }

  public void obtainVol() {
  }

  public String getLicense() {
    return License;
  }

  public int getFlightHours() {
    return FlightHours;
  }

  @Override
  public String getRole() {
    return "Airplane Pilot";
  }

  
  public String getAirplanePilot() {
    return super.getEmployee() + ", License: " + License + ", Flight Hours: " + FlightHours;
  }
}
