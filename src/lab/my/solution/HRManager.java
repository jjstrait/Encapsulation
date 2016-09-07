/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.my.solution;

import java.util.Date;

/**
 *
 * @author jstra
 */
public class HRManager {
    private Employee employee;

    public void newEmployee(String firstName, String lastName,String ssn){
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setSsn(ssn);
        employee = emp;
        employee.orientation();
    }
    
    public String getEmpStatus(){
       return employee.getStatus();
    }
    
    
}
