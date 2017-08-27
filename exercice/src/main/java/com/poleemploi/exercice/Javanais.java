package com.poleemploi.exercice;

/**
 * This class transform message from french to javanais
 * and inversaly. 
 */

public class Javanais {
	
	/**
	 * Transform a French message into Javanais
	 * @param source
	 * @return 
	 */
	public String getJavanaisMsg(String source){
		return source.replaceAll("((?<=([a-zA-Z&&[^aeiouyAEIOUY]]))([aeiouyAEIOUY]))|^[aeoiuyAEIOUY]", "av$0");
	}
	
	/**
	 * Transform a javanais message to franch
	 * @param source
	 * @return 
	 */
	public String getFrenchMsg(String source){
		return source.replaceAll("^av(?=[aeouiAEIOUY])|((?<=([a-zA-Z&&[^aeiouyAEIOUY]]))av(?=[aeouiAEIOUY]))", "");
	}

}
