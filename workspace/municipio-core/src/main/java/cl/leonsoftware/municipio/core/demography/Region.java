/**
 * 
 */
package cl.leonsoftware.municipio.core.demography;

import java.util.List;

/**
 * @author kuvasz
 *
 */
public class Region 
{
	private String oid;
	private String name;
	private List<Commune> communes;
	
	
	/**
	 * 
	 */
	public Region() 
	{
	}
	
	/**
	 * 
	 * @param oid
	 */
	public Region(String oid) 
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
	 * @return the communes
	 */
	public List<Commune> getCommunes() {
		return communes;
	}

	/**
	 * @param communes the communes to set
	 */
	public void setCommunes(List<Commune> communes) {
		this.communes = communes;
	}
	
}
