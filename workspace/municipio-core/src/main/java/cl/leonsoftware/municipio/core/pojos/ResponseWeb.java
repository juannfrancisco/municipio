/**
 * 
 */
package cl.leonsoftware.municipio.core.pojos;

/**
 * ---------------------------------------------------------------------------
 * Maldonado León - Factoria de desarrollo de Software 
 * @author Juan Francisco Maldonado León - ( juan.maldonado.leon@gmail.com )
 * @date 21-11-2015
 * Description : 
 * ---------------------------------------------------------------------------
 */
public class ResponseWeb 
{
	
	private String code;
	private String message;
	private String stack;
	
	public ResponseWeb()
	{}
	
	/**
	 * @param code
	 * @param message
	 */
	public ResponseWeb(String code, String message) {
		this.code = code;
		this.message = message;
	}

	
	
	
	/**
	 * @param code
	 * @param message
	 * @param stack
	 */
	public ResponseWeb(String code, String message, String stack) {
		this.code = code;
		this.message = message;
		this.stack = stack;
	}



	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the stack
	 */
	public String getStack() {
		return stack;
	}
	/**
	 * @param stack the stack to set
	 */
	public void setStack(String stack) {
		this.stack = stack;
	}

}
