/**
 * 
 */
package cl.leonsoftware.municipio.core.person;

/**
 * ---------------------------------------------------------------------------
 * León Software - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 09-12-2015
 * @desc 
 * ---------------------------------------------------------------------------
 */
public class Location 
{
	
	private String latitude;
	private String longitude;
	
	public Location() 
	{
		
	}
	
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	

}
