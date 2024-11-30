package project;

import project.Models.AirplanePilot;
import project.Models.Employee;
import project.Models.Person;

public class AirlineManagement {
    public static void main(String[] args) {
        Person person = new Person(20995, "Bob", "25 street of Oxford", "+33(0)602156833");

        Employee employee = new Employee(34984, "Jack", "pipsi", "03943", 333, "343/A434/434", "Airplane Pilot");

        AirplanePilot pilot = new AirplanePilot(234324, "Ruben", "Issy les moul", "0323233", 23232, "4343/3443/3", "Airplane Pilor", "Licensed", 21332);

        System.out.println(person.getInfos());
        System.out.println("\n");
        System.out.println(employee.getEmployee());
        System.out.println("\n");
        System.out.println(pilot.getAirplanePilot());
        System.out.println("\n");
    }
}
