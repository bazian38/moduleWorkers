package PL;

import BackEnd.Employee;
import BackEnd.Shift;

import java.util.LinkedList;

/**
 * Created by ahmad on 4/6/2016.
 */
public class FirstPL {

    private EmployeePL employee;
    private ShiftAndEmployeePL shiftAndEmployee;
    private ShiftPL shift;

    private void create(){

        employee=new EmployeePL();
        shiftAndEmployee=new ShiftAndEmployeePL();
        shift=new ShiftPL();

    }


    public void Run(){

    }

   static void Print(LinkedList<Employee> emp){}
    static void Print2(LinkedList<Shift> shift){}
}
