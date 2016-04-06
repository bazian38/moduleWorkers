package BackEnd;

import java.util.Date;

/**
 * Created by ahmad on 4/6/2016.
 */
public class Shift {




    private  String branch;
    private int Time;
    private Date date;
    private String ManagerID;


    public Shift(String branch, int time, Date date, String managerID) {
        this.branch = branch;
        Time = time;
        this.date = date;
        ManagerID = managerID;
    }

    public String getBranch() {
        return branch;
    }

    public int getTime() {
        return Time;
    }

    public Date getDate() {
        return date;
    }

    public String getManagerID() {
        return ManagerID;
    }











    @Override
    public String toString() {
        return "Shift{" +
                "branch='" + branch + '\'' +
                ", Time=" + Time +
                ", date=" + date +
                ", ManagerID='" + ManagerID + '\'' +
                '}';
    }

}
