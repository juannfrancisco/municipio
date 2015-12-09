/**
 * 
 */
package cl.leonsoftware.municipio.core.administration;

import java.io.Serializable;
import java.util.List;

/**
 * ---------------------------------------------------------------------------
 * León Software - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 02-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Profile implements Serializable
{
	private static final long serialVersionUID = 5208577235812690197L;
	private String oid;
	private String name;
	private String description;
	private List<Module> modules;
	
	/**
	 * 
	 */
	public Profile() 
	{
	
	}
	
	/**
	 * 
	 * @param oid
	 */
	public Profile(String oid) {
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the modules
	 */
	public List<Module> getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	
	
	

}
