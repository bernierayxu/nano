// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.nano.soap12;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "Envelope", namespace = "http://www.w3.org/2003/05/soap-envelope")
public class Envelope implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Header")
	public Header header;	
	
	@Element(name = "Body")
	public Body body;	
	
    
}