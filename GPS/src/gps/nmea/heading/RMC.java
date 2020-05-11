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
public class RMC extends Heading {

    String id, utc, status, latitudeNumber, latitudeDirection,
            longitudeNumber, longitudeDirection, speed, angile, date,
            magneticDeviationNumber, magneticDeviationDirection, checksum;

    public RMC() {
    }

    public RMC(String fileLine) {
        super(fileLine);
        setValue();
    }

    public void setValue() {
        try {
            id = splitedArray[0];
            utc = splitedArray[1];
            status = splitedArray[2];
            latitudeNumber = splitedArray[3];
            latitudeDirection = splitedArray[4];
            longitudeNumber = splitedArray[5];
            longitudeDirection = splitedArray[6];
            speed = splitedArray[7];
            angile = splitedArray[8];
            date = splitedArray[9];
            magneticDeviationNumber = splitedArray[10];
            magneticDeviationDirection = splitedArray[11];
            checksum = splitedArray[12];

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("ERROR! Index of bounds exception in RMC.class");
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

    
    @Override
    public String toString() {
        return "RMC{" + "id=" + id + ", utc=" + utc + ", status=" + status + ", latitudeNumber=" + latitudeNumber + ", latitudeDirection=" + latitudeDirection + ", longitudeNumber=" + longitudeNumber + ", longitudeDirection=" + longitudeDirection + ", speed=" + speed + ", angile=" + angile + ", date=" + date + ", magneticDeviationNumber=" + magneticDeviationNumber + ", magneticDeviationDirection=" + magneticDeviationDirection + ", checksum=" + checksum + '}';
    }

}
