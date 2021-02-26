package com.owidi.locklear.TIEFIGHTERS;

import com.owidi.locklear.TIESPT.Location;
import com.owidi.locklear.TIESPT.TiePilot;
import com.owidi.locklear.TIEWPNS.TieWeapon;

public class TieFighter {
    String manufacturer,IDNumber,model,fighterClass;
    TieWeapon[] wpns;
    TiePilot pilot;
    double length,width,height;
    int fullCapacity,maxSpeed;
    boolean isLanded,isSpacebourne;
    Location currentLocation;

    //    default constructor
    TieFighter(){

    }

    //    overloaded method
    TieFighter(String IDNumber,TiePilot pilot){

    }

    //    display Tie Fighter data
    void displayFighterData(){

    }

    //    abstract fires cannon method to be implemented
    //    abstract void FiresCannons(){
    //
    //    }

}
