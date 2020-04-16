/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se175;

import util.Mytoys;

/**
 *
 * @author Admin
 */
public class SE175 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + Mytoys.cF(5));//120
        System.out.println("6! = " + Mytoys.cF(6));//720
        System.out.println("0! = " + Mytoys.cF(0));//1\
        System.out.println("Exception: " + Mytoys.cF(-5)); //sấp mặt, throw Exception
                                                        //JVM giết app
       
    }
    
}
