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

    Map<String, String> visibleSatelites;
    List<String> satelitesOfCurrentPosition;

    public Satelites() {
    }

    public Satelites(Map<String, String> visibleSatelites, List<String> satelitesOfCurrentPosition) {
        this.visibleSatelites = visibleSatelites;
        this.satelitesOfCurrentPosition = satelitesOfCurrentPosition;
    }

    public Map<String, String> getVisibleSatelites() {
        return visibleSatelites;
    }

    public void setVisibleSatelites(Map<String, String> visibleSatelites) {
        this.visibleSatelites = visibleSatelites;
    }

    public List<String> getSatelitesOfCurrentPosition() {
        return satelitesOfCurrentPosition;
    }

    public void setSatelitesOfCurrentPosition(List<String> satelitesOfCurrentPosition) {
        this.satelitesOfCurrentPosition = satelitesOfCurrentPosition;
    }

}
