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
public class GGA extends Heading {

    String id, utc, latitudeNumber, latitudeDirection,
            longitudeNumber, longitudeDirection, measurementQuality,
            trackedSatelitesNumber, hdop, aboveSeaLevelNumber, aboveSeaLevelCalculatedIn,
            geoidHeightNumber, geoidHeightCalculatedIn, lastTimeUpdateDGPS, idStationDGPS, checksum;

    public GGA(String fileLine) {
        super(fileLine);
        setValue();
    }

    public void setValue() {
        try {
            id = splitedArray[0];
            utc = splitedArray[1];
            latitudeNumber = splitedArray[2];
            latitudeDirection = splitedArray[3];
            longitudeNumber = splitedArray[4];
            longitudeDirection = splitedArray[5];
            measurementQuality = splitedArray[6];
            trackedSatelitesNumber = splitedArray[7];
            hdop = splitedArray[8];
            aboveSeaLevelNumber = splitedArray[9];
            aboveSeaLevelCalculatedIn = splitedArray[10];
            geoidHeightNumber = splitedArray[11];
            geoidHeightCalculatedIn = splitedArray[12];
            lastTimeUpdateDGPS = splitedArray[13];
            idStationDGPS = splitedArray[14];
            checksum = splitedArray[15];

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("ERROR! Index of bounds exception in GGA.class");
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
        return "GGA{" + "id=" + id + ", utc=" + utc + ", latitudeNumber=" + latitudeNumber + ", latitudeDirection=" + latitudeDirection + ", longitudeNumber=" + longitudeNumber + ", longitudeDirection=" + longitudeDirection + ", measurementQuality=" + measurementQuality + ", trackedSatelitesNumber=" + trackedSatelitesNumber + ", hdop=" + hdop + ", aboveSeaLevelNumber=" + aboveSeaLevelNumber + ", aboveSeaLevelCalculatedIn=" + aboveSeaLevelCalculatedIn + ", geoidHeightNumber=" + geoidHeightNumber + ", geoidHeightCalculatedIn=" + geoidHeightCalculatedIn + ", lastTimeUpdateDGPS=" + lastTimeUpdateDGPS + ", idStationDGPS=" + idStationDGPS + ", checksum=" + checksum + '}';
    }
}
