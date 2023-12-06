package worksheetk;

public class Main {
	public static void main(String[] args) {
		SurveyStationAccess surveyAccess = new SurveyStationAccess("Messdaten.txt");
	
		int numberOfStations = surveyAccess.getNumberOfSurveyStations();  
		System.out.println("Anzahl der Messstationen: " + numberOfStations);

        SurveyStation lowestStation = surveyAccess.findLowestStation();
        System.out.println("Messstation mit niedrigster Höhe: " + lowestStation.getStationName() + " mit der Höhe " + lowestStation.getAltitude() );
 
        SurveyStation highestStation = surveyAccess.findHighestStation();
        System.out.println("Messstation mit höchster Höhe: " + highestStation.getStationName() + " mit der Höhe " + highestStation.getAltitude() );

        SurveyStation northernmostStation = surveyAccess.findNorthernmostStation();
        System.out.println("Nördlichste Messstation: " + northernmostStation.getStationName() + " " + northernmostStation.getLatitude() );
        
        SurveyStation southernmostStation = surveyAccess.findSouthernmostStation();
        System.out.println("Süderste Messstation: " + southernmostStation.getStationName() + " " + southernmostStation.getLatitude() );
        
        SurveyStation easternmostStation = surveyAccess.findEasternmostStation();
        System.out.println("Easterste Messstation: " + easternmostStation.getStationName() + " " + easternmostStation.getLongitude() );
        
        SurveyStation westernmostStation = surveyAccess.findWesternmostStation();
        System.out.println("Westlichste Messstation: " + westernmostStation.getStationName() + " " + westernmostStation.getLongitude() );
        
 
	}
}
