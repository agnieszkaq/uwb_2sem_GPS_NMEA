/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps.nmea;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class NMEAParser {

    public void analize(String fileLine) {
        if (fileLine.length() >= 80) {
            System.out.println("dłuższy niż 80 znaków");

        } else if (fileLine.length() == 0) {
            System.out.println();

        } else if (fileLine.length() > 0) {
            switch (fileLine.substring(1, 6)) {
                case "GPRMC": {
                    System.out.println("GPRMC");
                    break;
                }
                case "GPGGA": {
                    System.out.println("GPGGA");
                    break;
                }
                case "GPGSA": {
                    System.out.println("GPGSA");
                    break;
                }
                case "GPGSV": {
                    System.out.println("GPGSV");
                    break;
                }
                case "GPGLL": {
                    System.out.println("GPGLL");
                    break;
                }
                case "GPVTG": {
                    System.out.println("GPVTG");
                    break;
                }
                /* default:
                    System.out.println(fileLine);
                 */
            }
        } else {
            System.out.println("Something goes wrong!");
        }
    }
}
