package application;

import entity.*;
import dao.*;
public class CompanyApp {
    public static void main(String[] args) {

        EmployeeDao empdao = new EmployeeDao();

        System.out.println("-- Lisätään 2 työntekijää tietokantaan");
        empdao.persist(new Employee("Viivi", "Puro", "viivip@mymail.fi", 7300.00));
        empdao.persist(new Employee("Tero", "Koski", "tero.koski@mymail.fi", 3750.00));

        Employee emp = empdao.find(1);
        System.out.println("-- Eka työntekijän nimi");
        System.out.println(emp.getFirstName() + " " + emp.getLastName());

        System.out.println("-- Muokataan eka työntekijän sukunimeä");
        emp.setLastName("Koski");
        empdao.update(emp);
        System.out.println("-- Eka työntekijän tietoja:");
        System.out.println(emp.getFirstName() + " " + emp.getLastName() + " email: " + emp.getEmail());
    }
}
