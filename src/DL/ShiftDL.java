package DL;

import BackEnd.Shift;
import sun.awt.image.ImageWatched;

import java.util.Date;
import java.util.LinkedList;

/**
 * This Class is The Link Between The System And The DB of The System
 * Just Using The Shifts Relation In The DB
 * Created by ahmad on 4/6/2016.
 */
public class ShiftDL {


    /**
     * This Method Add new Shift
     * @param shift The shift that you want to add
     * @return true if the addtion Done
     *          else return false
     */
    public boolean addShift(Shift shift){
        // TODO: 4/6/2016
        return false;
    }

    /**
     *This Method search Shifts From The DB That The ID of the Manager Of the Shift IS {@param ID}
     * @param ID the id of The Manager of The Shift
     * @return {@link LinkedList<Shift>} of The Shifts
     */
    public LinkedList<Shift> searchByManagerID(String ID){
        // TODO: 4/6/2016
        return null;
    }

    /**
     * This Method search Shift From The DB That The Date Of them is {@param date}
     * @param date the date that the shift was in it
     * @return {@link LinkedList<Shift>} of the Shifts(Max 2 Shifts)
     */
    public LinkedList<Shift> searchByDate(Date date){
        // TODO: 4/6/2016
        return null;

    }

    /**
     * Searching Shifts In The DB By The Shift Number (1=morning,2=night)
     * @param shift The Number of Shift
     * @return {@link LinkedList<Shift>} of The Shifts That Have Done In The shift time {@param shift}
     */
    public LinkedList<Shift> searchByShift(int shift){
        // TODO: 4/6/2016
        return null;
    }

    /**
     * Removing The Shift {@param shift} From The DB
     * @param shift the Shift that you want to remove
     * @return true if the Removing Done
     */
    public boolean Remove(Shift shift){
        // TODO: 4/6/2016
        return false;
    }

}
