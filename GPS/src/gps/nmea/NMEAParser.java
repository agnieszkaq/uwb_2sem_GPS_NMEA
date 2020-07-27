/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps.nmea;

import gps.Satelites;
import gps.UserPosition;
import gps.nmea.heading.GGA;
import gps.nmea.heading.GLL;
import gps.nmea.heading.GSA;
import gps.nmea.heading.GSV;
import gps.nmea.heading.RMC;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NMEAParser {

	UserPosition userPosition = new UserPosition();
	Satelites satelites = new Satelites();
	NMEAModel nmeaModel = new NMEAModel();

	List gvsFileLineList = new ArrayList();

	public boolean getFileLineLenght(String fileLine) {
		return (fileLine.length() >= 80);
	}

	public boolean isFileLenghtZero(String fileLine) {
		return ((fileLine.length() == 0));
	}

	public void gsvGenerate(String fileLine) {
		GSV gsv = new GSV();
		this.gvsFileLineList.add(fileLine);
		gsv.setFileLineList(gvsFileLineList);
		gsv.checkLine();
	}

	public void specyficHeaderGnerator(String fileLine) {
		switch (fileLine.substring(1, 6)) {
		case "GPRMC": {
			RMC rmc = new RMC(fileLine);
			userPosition.setAll(rmc.getLatitudeNumber(), rmc.getLatitudeDirection(), rmc.getLongitudeNumber(),
					rmc.getLongitudeDirection());

			System.out.println(userPosition.toString());
			break;
		}
		case "GPGGA": {
			GGA gga = new GGA(fileLine);
			userPosition.setAll(gga.getLatitudeNumber(), gga.getLatitudeDirection(), gga.getLongitudeNumber(),
					gga.getLongitudeDirection());

			System.out.println(userPosition.toString());
			break;
		}
		case "GPGSA": {
			GSA gsa = new GSA(fileLine);
			gsa.toString();
			satelites.setSatelitesOfCurrentPosition(gsa.getSatelites());

			System.out.println(satelites.stringOfCurrentPosition());
			break;
		}
		case "GPGLL": {
			GLL gll = new GLL(fileLine);
			userPosition.setAll(gll.getLatitudeNumber(), gll.getLatitudeDirection(), gll.getLongitudeNumber(),
					gll.getLongitudeDirection());

			System.out.println(userPosition.toString());
			break;
		}
		}
	}

	public void parse(String fileLine) {
		if (getFileLineLenght(fileLine)) {
			// System.out.println("Too much chars.");

		} else if (isFileLenghtZero(fileLine)) {
			// System.out.println("Lenght is zero.");

		} else if (fileLine.length() > 0) {
			if (fileLine.substring(1, 6).equals("GPGSV")) {
				gsvGenerate(fileLine);

			} else {
				gvsFileLineList.removeAll(gvsFileLineList);
				specyficHeaderGnerator(fileLine);
			}
		} else {
			System.out.println("Something goes wrong!");
		}
	}
}
