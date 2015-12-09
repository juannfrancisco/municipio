/**
 * 
 */
package cl.leonsoftware.municipio.core.person;

import cl.leonsoftware.municipio.core.demography.Commune;
import cl.leonsoftware.municipio.core.demography.Country;
import cl.leonsoftware.municipio.core.demography.Region;

/**
 * 
 * ---------------------------------------------------------------------------
 * León Software - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 09-12-2015
 * @desc 
 * ---------------------------------------------------------------------------
 */
public class Address 
{
	private Country country;
	private Region region;
	private Commune commune;
	private String street;
	private String number;
	private Location location;
	
	
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}
	/**
	 * @return the commune
	 */
	public Commune getCommune() {
		return commune;
	}
	/**
	 * @param commune the commune to set
	 */
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
}
