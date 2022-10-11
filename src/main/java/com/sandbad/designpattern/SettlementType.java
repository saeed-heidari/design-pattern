package com.gitabin.demand.core.model;

public enum SettlementType {

	CASH(1),

	CHEQUE(2),

	CREDIT(3),

	CONSENSUAL(4),

	;

	private int value;

	public int value() {
		return value;
	}

	private SettlementType(int value) {
		this.value = value;
	}
	
	
	public static SettlementType valueOf(int value) {
		for (SettlementType item : SettlementType.values())
			if (item.value() == value)
				return item;
		return null;
	}
}
