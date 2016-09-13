package com.company;

/**
 * Created by dpennebacker on 9/12/16.
 */
public class studentRandomID {

    public static  String randID ()
    {
        String ID = "";
        for(int i = 0; i < 6; i++)
        {
            int IDnum = (int)(Math.random()*10);
            ID = ID + IDnum;

        }
        return ID;
    }
}
