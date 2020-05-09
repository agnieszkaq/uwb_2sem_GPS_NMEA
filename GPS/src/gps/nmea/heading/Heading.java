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
public class Heading {

    String fileLine;
    String[] splitedArray = null;

    public Heading() {
    }

    public Heading(String fileLine) {
        this.fileLine = fileLine;
        splitArray();
    }

    public String getFileLine() {
        return fileLine;
    }

    public void setFileLine(String fileLine) {
        this.fileLine = fileLine;
    }

    public void splitArray() {
        this.splitedArray = this.fileLine.split(",");
    }

    public String[] getSplitedArray() {
        return splitedArray;
    }

    public void setSplitedArray(String[] splitedArray) {
        this.splitedArray = splitedArray;
    }

}
