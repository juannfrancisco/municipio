/**
 * 
 */
package cl.leonsoftware.municipio.core.demography;

/**
 * @author kuvasz
 *
 */
public class Commune 
{
	private String oid;
	private String name;

	
	/**
	 * 
	 */
	public Commune() 
	{
	}
	
	/**
	 * 
	 * @param oid
	 */
	public Commune(String oid) 
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
	
}
