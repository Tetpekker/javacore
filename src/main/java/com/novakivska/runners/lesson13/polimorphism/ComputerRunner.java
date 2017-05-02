package com.novakivska.runners.lesson13.polimorphism;

import com.novakivska.app.classwork.lesson13.Polymorphism.*;

/**
 * Created by Tas_ka on 4/28/2017.
 */
public class ComputerRunner {
    public static void main(String[] args) {
//        IBM ibm = new IBM();
//        ibm.changeOnlyForIBM();
        Computer ibmComputer = new IBM();
        Computer hpComputer = new HP();
        Computer mac = new MAC();
        Computer asusComputer = new ASUS();
        Computer sonyVaio = new SonyVaio();
//        changesForComputers(ibmComputer);
//        changesForComputers(hpComputer);
//        changesForComputers(acerComputer);
//        changesForComputers(mac);
        Computer [] computers = new Computer[5];
        computers[0] = ibmComputer;
        computers[1] = hpComputer;
        computers[2] = mac;
        computers[3] = asusComputer;
        computers[4] = sonyVaio;
        changesForComputersArray(computers);
    }
    public static void changesForComputersArray(
            Computer[] computers){
        for(Computer computer: computers) {
            changesForComputers(computer);
        }
    }
    public static void changesForComputers(Computer computer){
        computer.changeRAM();
        computer.changeTOSSD();
    }
}
