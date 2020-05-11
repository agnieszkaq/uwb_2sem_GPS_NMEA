/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps.nmea.heading;

/**
 *
 * @author Admin
 */
public class GSA extends Heading {

    String id, positionNumber, dop, hdop, vdop, checksum;
    String[] satelites = new String[12];

    public GSA() {
    }

    public GSA(String fileLine) {
        super(fileLine);
        setValue();
    }

    public void setValue() {
        try {
            id = splitedArray[0];
            positionNumber = splitedArray[2];

            for (int i = 0; i < 12; i++) {
                satelites[i] = splitedArray[i + 3];
            }
            dop = splitedArray[15];
            hdop = splitedArray[16];
            vdop = splitedArray[17];
            checksum = splitedArray[18];

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("ERROR! Index of bounds exception in GSA.class");
        }
    }

    public String[] getSatelites() {
        return satelites;
    }

    public void setSatelites(String[] satelites) {
        this.satelites = satelites;
    }

    @Override
    public String toString() {

        String satelite = " SATELITES:";
        for (int i = 0; i < 12; i++) {
            satelite += " s" + (i + 1) + ":" + satelites[i];
        }
        return "GSA{" + "id=" + id + ", positionNumber=" + positionNumber + ", dop=" + dop + ", hdop=" + hdop + ", vdop=" + vdop + ", checksum=" + checksum + satelite + '}';
    }
}
