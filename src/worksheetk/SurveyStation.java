package worksheetk;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SurveyStation {
	private short stationId;
	private Calendar startDate;
	private Calendar finishDate;
	private short altitude;
	private double latitude;
	private double longitude;
	private String stationName;
	private String federalState;

	public SurveyStation() {

	}
	
	public SurveyStation(short stationId, String startDate, String finishDate, short altitude, double latitude, double longitude, String stationName, String federalState) {
	    this.stationId = stationId;
	    this.startDate = calendarFormatOf(startDate);
	    this.finishDate = calendarFormatOf(finishDate);
	    this.altitude = altitude;
	    this.latitude = latitude;
	    this.longitude = longitude;
	    this.stationName = stationName;
	    this.federalState = federalState;
	}
	
	public short getAltitude () {
		return altitude;
	}
	
	public double getLatitude () {
		return latitude;
	}
	
	public double getLongitude () {
		return longitude;
	}
	
	public String getStationName () {
		return stationName;
	}
	
	public Calendar calendarFormatOf(String sD) {
	    try {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	        Calendar c = Calendar.getInstance();
	        c.setTime(dateFormat.parse(sD));
	        return c;
	    } catch (Exception e) {
	        System.out.println("Fehler beim Parsen des Datums: " + e.getMessage());
	        return null;
	    }
	}

}