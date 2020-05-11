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
public class GLL extends Heading {

    String id, latitudeNumber, latitudeDirection,
            longitudeNumber, longitudeDirection, hour, status, checksum;

    public GLL() {
    }

    public GLL(String fileLine) {
        super(fileLine);
        setValue();
    }

    public void setValue() {
        try {
            id = splitedArray[0];
            latitudeNumber = splitedArray[1];
            latitudeDirection = splitedArray[2];
            longitudeNumber = splitedArray[3];
            longitudeDirection = splitedArray[4];
            hour = splitedArray[5];
            status = splitedArray[6];
            checksum = splitedArray[7];

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("ERROR! Index of bounds exception in GLL.class");
        }
    }

    public String getLatitudeNumber() {
        return latitudeNumber;
    }

    public void setLatitudeNumber(String latitudeNumber) {
        this.latitudeNumber = latitudeNumber;
    }

    public String getLatitudeDirection() {
        return latitudeDirection;
    }

    public void setLatitudeDirection(String latitudeDirection) {
        this.latitudeDirection = latitudeDirection;
    }

    public String getLongitudeNumber() {
        return longitudeNumber;
    }

    public void setLongitudeNumber(String longitudeNumber) {
        this.longitudeNumber = longitudeNumber;
    }

    public String getLongitudeDirection() {
        return longitudeDirection;
    }

    public void setLongitudeDirection(String longitudeDirection) {
        this.longitudeDirection = longitudeDirection;
    }
}
