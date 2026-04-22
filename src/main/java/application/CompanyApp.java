package application;

import entity.*;
import dao.*;

import java.util.List;

public class CompanyApp {
    public static void main(String[] args) {

        EmployeeDao empdao = new EmployeeDao();

        System.out.println("-- Lisätään 2 työntekijää tietokantaan");
        empdao.persist(new Employee("Viivi", "Puro", "viivip@mymail.fi", 7300.00));
        empdao.persist(new Employee("Tero", "Koski", "tero.koski@mymail.fi", 3750.00));

        // haetaan kaikkien työntekijöiden tiedot
        List<Employee> employees = empdao.findAll();
        System.out.println("-- kaikkien työntekijöiden nimet ja palkka");
        for (Employee e : employees) {
            System.out.println(e.getFirstName() + " " + e.getLastName() + ", " + e.getSalary());
        }


    }
}
