// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

@RootElement(name = "Property", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class Property implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Name")
	@Order(value=0)
	public String name;	
	
	@Element(name = "Value")
	@Order(value=1)
	public String value;	
	
    
}