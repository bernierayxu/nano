// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Creates a new Second Chance Offer (that is, an offer for an unsold item)
 * for one of that item's non-winning bidders.
 * 
 */
@RootElement(name = "AddSecondChanceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSecondChanceItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RecipientBidderUserID")
	@Order(value=0)
	public String recipientBidderUserID;	
	
	@Element(name = "BuyItNowPrice")
	@Order(value=1)
	public AmountType buyItNowPrice;	
	
	@Element(name = "Duration")
	@Order(value=2)
	public SecondChanceOfferDurationCodeType duration;	
	
	@Element(name = "ItemID")
	@Order(value=3)
	public String itemID;	
	
	@Element(name = "SellerMessage")
	@Order(value=4)
	public String sellerMessage;	
	
    
}