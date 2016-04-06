package DL;

import BackEnd.Employee;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by ahmad on 4/6/2016.
 */
public class EmployeeDL {


    /**
     * This Method search in The Data Base of The System for an Employee that his ID is {@code ID}
     * @param ID The ID of the Employee
     * @return {@link LinkedList} of one {@Link Employee}
     */
    public LinkedList<Employee> searchByID(String ID){

        //TODO
        return null;
    }

    /**
     * This Method search in The Data Base of The System for an Employees that there Name is {@code Name}
     * @param Name The Name of the Employee
     * @return {@link LinkedList} of The Employees That There's Name IS {@code Name}
     */
    public LinkedList<Employee> searchByName(String Name){

        //TODO
        return null;
    }

    /**
     * This Method search in The Data Base of The System for an Employees that there Job Title is {@code Name}
     * @param Name The Name of the JobTitle
     * @return {@link LinkedList} of The Employees That There's Job Title IS {@code Name}
     */
    public LinkedList<Employee> searchByJobTitle(String Name){

        //TODO
        return null;
    }



    /**
     * This Method insert to The Data Base of The System an Employee {@code emp}
     * @param emp The Name of the Employee
     * @return true if the insertation to The Data Base is Done (There's no Problems And There's No employee that have the Same ID In The Data Base)
     *         false if the insetation Didn't Done Because OF Problems
     */
    public boolean insert(Employee emp){

        //TODO
        return false;
    }


    /**
     * This Method Remove Employee By getting His ID
     * @param ID The ID of The Employee That You Want to Remove
     * @return true if the Employee Removed
     *         else return false
     */
    public boolean Remove(String ID){
        //TODO
        return false;
    }

    /**
     * This Method Updating The Bank Number Of The Employee That his ID is {@param ID}
     * @param ID The ID of The Employee That You Want To Update His Bank Number
     * @param BankNumber The New Bank Number
     * @return true if the Bank Number of The Employee Updated
     *         else return false
     */
    public boolean UpdateBankNumber(String ID,String BankNumber){


        //TODO
        return false;
    }


    /**
     *
     * This Method Updating The Wage Of The Employee That his ID is {@param ID}
     * @param ID The ID of The Employee That You Want To Update His hourly Wage
     * @param NewWage The New hourly Wage
     * @return true if the hourly Wage of The Employee has been Updated
     *         else return false
     */
    public boolean UpdateHourlyWage(String ID,double NewWage){
        //TODO
        return false;
    }

    /**
     *
     * This Method Updating The Job Title Of The Employee That his ID is {@param ID}
     * @param ID The ID of The Employee That You Want To Update His Job Title
     * @param JobTitle The New Job Title
     * @return true if the Job Title of The Employee has been Updated
     *         else return false
     */
    public boolean UpdateTheJobTitle(String ID,String JobTitle){

        //TODO

        return false;

    }


    /**
     * This Method Updating The Constraint That The Employee Want
     * @param ID The ID of The Employee That You Want To Update His Constraint
     * @param Constraint {@link HashMap<Integer,Integer>} that The Key Is the Day That The Employee Can working in it(1=Sunday,..,7=Saturday) And The Value Is The Shift That The
     *                                                    The employee Can work It(1=morning , 2=night).
     * @return true if The Constraints of The Emplyee have been Updated
     *         else return false.
     */
    public boolean UpdateTheConstraint(String ID, HashMap<Integer,Integer> Constraint){

//// TODO: 4/6/2016
        return false;


    }
}
