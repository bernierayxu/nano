// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

@RootElement(name = "BrowseNodes", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class BrowseNodes implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Request")
	@Order(value=0)
	public Request request;	
	
	@Element(name = "BrowseNode")
	@Order(value=1)
	public List<BrowseNode> browseNode;	
	
    
}