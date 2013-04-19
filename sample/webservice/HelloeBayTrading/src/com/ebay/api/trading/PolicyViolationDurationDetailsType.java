// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * [Selling] The details about the range used to calculate policy violations.
 */
public class PolicyViolationDurationDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Period")
	@Order(value=0)
	public PeriodCodeType period;	
	
	@Element(name = "Description")
	@Order(value=1)
	public String description;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}