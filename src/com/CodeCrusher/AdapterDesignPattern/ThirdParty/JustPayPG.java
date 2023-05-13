package com.CodeCrusher.AdapterDesignPattern.ThirdParty;

import java.util.UUID;

public class JustPayPG {
	public boolean beginPAyment(UUID orderNumber){
		System.out.println(" Payment started using JustPay");
		return true;
	}
}
