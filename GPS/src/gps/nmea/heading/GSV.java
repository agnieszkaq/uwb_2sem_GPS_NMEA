/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps.nmea.heading;

import gps.Satelites;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GSV extends Heading {

    List fileLineList = new ArrayList();
    String[] splitedOneLine = null;
    String replaceString = "";
    List<Satelites> visibleSatelites = new ArrayList<Satelites>();

    public List<Satelites> getVisibleSatelites() {
        return visibleSatelites;
    }

    public void setVisibleSatelites(List<Satelites> visibleSatelites) {
        this.visibleSatelites = visibleSatelites;
    }

    public GSV() {
    }

    public GSV(String fileLine) {
        super(fileLine);
    }

    public List getFileLineList() {
        return fileLineList;
    }

    public void setFileLineList(List fileLineList) {
        this.fileLineList = fileLineList;
    }

    public void showList(List lista1) {
        System.out.println(Arrays.toString(lista1.toArray()));
    }

    public void checkLine() {
        String firstLine = this.fileLineList.get(0).toString();
        this.splitedArray = firstLine.split(",", -1);

        String a = splitedArray[1].toString();
        String b = Integer.toString(this.fileLineList.size());

        if (a.equals(b)) {
            //System.out.println("Accepted");
            generateList(fileLineList);
        } else {
            // System.err.println("Not accepted");
        }
    }

    public void generateList(List list) {
        System.out.print("List of visible satelites: ");
        for (int j = 0; j < list.size(); j++) {
            String firstLine = list.get(j).toString();

            this.replaceString = firstLine.replace('*', ',');
            this.splitedOneLine = this.replaceString.split(",", -1);

            for (int i = 4; i < this.splitedOneLine.length - 1; i = i + 4) {
                Satelites satelite = new Satelites(this.splitedOneLine[i], this.splitedOneLine[i + 1], this.splitedOneLine[i + 2], this.splitedOneLine[i + 3]);
                visibleSatelites.add(satelite);
            }
        }
        System.out.println(visibleSatelites.toString());
    }
}
