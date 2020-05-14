package gps;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserPosition {

	String latitudeNumber, latitudeDirection, longitudeNumber, longitudeDirection;

	public UserPosition() {
	}

	public UserPosition(String latitudeNumber, String latitudeDirection, String longitudeNumber,
			String longitudeDirection) {
		this.latitudeNumber = latitudeNumber;
		this.latitudeDirection = latitudeDirection;
		this.longitudeNumber = longitudeNumber;
		this.longitudeDirection = longitudeDirection;
	}

	@Override
	public String toString() {
		return "UserPosition{" + "latitudeNumber=" + latitudeNumber + ", latitudeDirection=" + latitudeDirection
				+ ", longitudeNumber=" + longitudeNumber + ", longitudeDirection=" + longitudeDirection + '}';
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

	public void setAll(String atitudeNumber, String latitudeDirection, String longitudeNumber,
			String longitudeDirection) {
		this.latitudeNumber = latitudeNumber;
		this.latitudeDirection = latitudeDirection;
		this.longitudeNumber = longitudeNumber;
		this.longitudeDirection = longitudeDirection;
	}
}
