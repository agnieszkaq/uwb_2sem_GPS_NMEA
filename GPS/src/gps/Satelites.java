package gps;

import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Satelites {

    String[] satelitesOfCurrentPosition = new String[12];

    String PRN, elevation, azimuth, SNR;

    public Satelites(String PRN, String elevation, String azimuth, String SNR) {
        this.PRN = PRN;
        this.elevation = elevation;
        this.azimuth = azimuth;
        this.SNR = SNR;
    }

    public Satelites() {
    }

    public String getPRN() {
        return PRN;
    }

    public void setPRN(String PRN) {
        this.PRN = PRN;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(String azimuth) {
        this.azimuth = azimuth;
    }

    public String getSNR() {
        return SNR;
    }

    public void setSNR(String SNR) {
        this.SNR = SNR;
    }

    public String[] getSatelitesOfCurrentPosition() {
        return satelitesOfCurrentPosition;
    }

    public void setSatelitesOfCurrentPosition(String[] satelitesOfCurrentPosition) {
        this.satelitesOfCurrentPosition = satelitesOfCurrentPosition;
    }

    public String stringOfCurrentPosition() {
        String satelite = " SATELITES:";
        for (int i = 0; i < 12; i++) {
            if (satelitesOfCurrentPosition[i].isEmpty()) {
            } else {
                satelite += " s:" + satelitesOfCurrentPosition[i];
            }
        }
        return "Satelites of current position{" + satelite + '}';
    }

    @Override
    public String toString() {
        return "SATELITES{PRN: " + PRN + ", elevation: " + elevation + ", azimuth: " + azimuth + ", SNR:" + SNR + '}';
    }
}
