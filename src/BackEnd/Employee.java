package BackEnd;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by ahmad on 4/6/2016.
 */
public class Employee {



    private String ID;



    private String name;
    private Date startingDate;
    private String jobTitle;
    private String bankNumber;
    private String telephone;
    private double salaryForHour;
   private HashMap<Integer,Integer> workingDays;


    public Employee(String ID, String jobTitle, String name, Date startingDate, String bankNumber, String telephone, double salaryForHour, HashMap<Integer, Integer> workingDays) {
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.name = name;
        this.startingDate = startingDate;
        this.bankNumber = bankNumber;
        this.telephone = telephone;
        this.salaryForHour = salaryForHour;
        this.workingDays = workingDays;
    }



    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public double getSalaryForHour() {
        return salaryForHour;
    }

    public HashMap<Integer, Integer> getWorkingDays() {
        return workingDays;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", startingDate=" + startingDate +
                ", jobTitle='" + jobTitle + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaryForHour=" + salaryForHour +
                ", workingDays=" + workingDays +
                '}';
    }


}
