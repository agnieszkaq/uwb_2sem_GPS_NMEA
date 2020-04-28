/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class NMEAParser {

    void analize(String fileLine) {
        if (fileLine.length() >= 80) {
            System.out.println("Dłuzszy niż 80!");
        } else if (fileLine.length() == 0) {
            System.out.println("Pusta linia");
        } else if (fileLine.length() > 0 && !String.valueOf(fileLine.charAt(0)).equals("$")) {
            System.out.println("Nie zaczyna sie od $");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPRMC")) {
            System.out.println("RMC");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPRMB")) {
            System.out.println("RMB");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPGGA")) {
            System.out.println("GPGGA");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPGSA")) {
            System.out.println("GPGSA");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPGSV")) {
            System.out.println("GPGSV");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPGLL")) {
            System.out.println("GPGLL");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPBOD")) {
            System.out.println("GPBOD");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("PGRME")) {
            System.out.println("PGRME");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("PGRMZ")) {
            System.out.println("PGRMZ");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("PGRMM")) {
            System.out.println("PGRMM");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPRTE")) {
            System.out.println("GPRTE");
        } else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("HCHDG")) {
            System.out.println("HCHDG");
        }  else if (fileLine.length() > 0 && fileLine.substring(1, 6).equals("GPVTG")) {
            System.out.println("GPVTG");
        } else {
            System.out.println(fileLine);
        }
    }
}
