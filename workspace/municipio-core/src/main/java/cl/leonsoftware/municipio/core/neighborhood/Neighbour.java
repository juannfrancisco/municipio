/**
 * 
 */
package cl.leonsoftware.municipio.core.neighborhood;

import cl.leonsoftware.municipio.core.person.Address;
import cl.leonsoftware.municipio.core.person.Person;

/**
 * ---------------------------------------------------------------------------
 * León Software - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 08-11-2015
 * @desc 
 * ---------------------------------------------------------------------------
 */
public class Neighbour extends Person
{
	private static final long serialVersionUID = -7914730556567118985L;
	private Address address;
	
	
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
