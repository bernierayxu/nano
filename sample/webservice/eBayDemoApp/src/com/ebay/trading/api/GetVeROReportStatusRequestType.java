// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Retrieves status information about VeRO reported items you have submitted. You
 * can receive the status of individual items you have reported or, by specifying
 * VeROReportPacketID, you can retrieve status for all items reported with a given
 * VeROReportItems request. You can also retrieve items that were reported during a
 * given time period. If no input parameters are specified, status is returned on all
 * items you have reported in the last two years.
 * You must be a member of the Verified Rights Owner (VeRO) Program to use this
 * call.
 * 
 */
@RootElement(name = "GetVeROReportStatusRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetVeROReportStatusRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "VeROReportPacketID")
	@Order(value=0)
	public Long veROReportPacketID;	
	
	@Element(name = "ItemID")
	@Order(value=1)
	public String itemID;	
	
	@Element(name = "IncludeReportedItemDetails")
	@Order(value=2)
	public Boolean includeReportedItemDetails;	
	
	@Element(name = "TimeFrom")
	@Order(value=3)
	public Date timeFrom;	
	
	@Element(name = "TimeTo")
	@Order(value=4)
	public Date timeTo;	
	
	@Element(name = "Pagination")
	@Order(value=5)
	public PaginationType pagination;	
	
    
}