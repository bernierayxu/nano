// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Set of Store themes.
 * 
 */
public class StoreThemeArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Theme")
	@Order(value=0)
	public List<StoreThemeType> theme;	
	
	@Element(name = "GenericColorSchemeArray")
	@Order(value=1)
	public StoreColorSchemeArrayType genericColorSchemeArray;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}