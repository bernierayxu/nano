// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.nano.soap12;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

@RootElement(name = "Upgrade", namespace = "http://www.w3.org/2003/05/soap-envelope")
public class UpgradeType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SupportedEnvelope")
	public List<SupportedEnvType> supportedEnvelope;	
	
    
}