package DL;

import BackEnd.Employee;
import BackEnd.Shift;

import java.util.LinkedList;

/**
 * Created by ahmad on 4/6/2016.
 */
public class ShiftAndEmployeeDL {

    /**
     *  Adding Employee To Shift In The DB
     * @param employeeID The ID of The Employee that you want to add him to the shift
     * @param shift the shift that the employee will added to it
     * @return return true if it's Done correctly Else false
     */
    public boolean AddEmployeeToShift(String employeeID, Shift shift){
        // TODO: 4/6/2016
        return false;
    }


    /**
     *  Getting The Employee's Shifts
     * @param ID The ID of the employee
     * @return return {@link LinkedList} of {@link Shift} that the Employee Worked In Them
     */
    public LinkedList<Shift> getTheShiftsOfEmployee(String ID){
        // TODO: 4/6/2016  
        return null;
    }

    /**
     * Getting The Shift's Employees
     * @param shift The Shift That you want to there Employees
     * @return {@link LinkedList} of {@link Employee} that worked in the Shift {@param shift}
     */
    public LinkedList<Employee> getTheEmployeesOfTheShift(Shift shift){
        // TODO: 4/6/2016  
        return null;
    }

    /**
     * This Method search in The Data Base of The System for an Employees that there Job Title is {@code Name} and they Can work in the day {@code day} (1=Sunday,..,7=Saturday) and the Shift (@code shift)
     * (1=morning,2=night)
     * @param Name The Name of the JobTitle
     * @return {@link LinkedList} of The Employees That There's Job Title IS {@code Name}
     */
    public LinkedList<Employee> searchByJobTitleAndDay(String Name,int day ,int shift){

        // TODO: 4/6/2016
        return null;
    }

}
