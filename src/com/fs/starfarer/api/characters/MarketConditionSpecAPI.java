package com.fs.starfarer.api.characters;

public interface MarketConditionSpecAPI {

	float getOrder();
	String getId();
	String getName();
	String getDesc();
	String getIcon();
	String getScriptClass();
	void setIcon(String icon);
	boolean isPlanetary();
	boolean isDecivRemove();
	void setDecivRemove(boolean decivRemove);
	void setId(String id);
	void setName(String name);
	void setDesc(String desc);
	void setOrder(float order);
	void setPlanetary(boolean planetary);
}
