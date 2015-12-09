/**
 * 
 */
package cl.leonsoftware.municipio.core.administration;

import java.io.Serializable;
import java.util.List;

/**
 * ---------------------------------------------------------------------------
 * Maldonado León - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 08-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class Module implements Serializable
{
	private static final long serialVersionUID = -1398990589342961827L;
	private String oid;
	private String name;
	private String description;
	private String icon;
	private int order;
	private String url;
	private List<SubModule> modules;
	
	
	/**
	 * 
	 */
	public Module()
	{
		
	}
	
	/**
	 * 
	 * @param id
	 */
	public Module(String id) 
	{
		this.setOid(id);
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
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the modules
	 */
	public List<SubModule> getModules() {
		return modules;
	}
	/**
	 * @param modules the modules to set
	 */
	public void setModules(List<SubModule> modules) {
		this.modules = modules;
	}
	
}
