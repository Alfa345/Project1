package project.Models;

public class Employee extends Person {
  
  private int NumberEmp;
  private String HiringDate;
  private String Role;

  public Employee(int ID, String Name, String Address, String Contact, int NumberEmp, String HiringDate, String Role){

    super(ID, Name, Address, Contact);
    this.NumberEmp = NumberEmp;
    this.HiringDate = HiringDate;
    this.Role = Role;

  }

  public String getRole(){
    return Role;
  }
 

  public int getNumberEmp(){
    return NumberEmp;

  }

  public String getHiringDate(){
    return HiringDate;
  }

 
  public String getEmployee(){
    return  super.getInfos() + ", Employee Number: " +NumberEmp + ", Hiring Date: "+HiringDate + ", Role: "+ Role;
  }

}
