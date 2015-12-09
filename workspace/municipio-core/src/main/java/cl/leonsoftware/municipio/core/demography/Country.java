/**
 * 
 */
package cl.leonsoftware.municipio.core.demography;

import java.util.List;

/**
 * @author kuvasz
 *
 */
public class Country 
{
	private String oid;
	private String name;
	private List<Region> regions;
	
	
	/**
	 * 
	 */
	public Country() 
	{
	}
	
	/**
	 * 
	 * @param oid
	 */
	public Country(String oid) 
	{
		this.oid = oid;
	}

	/**
	 * @return the oid
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the regions
	 */
	public List<Region> getRegions() {
		return regions;
	}

	/**
	 * @param regions the regions to set
	 */
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
}
