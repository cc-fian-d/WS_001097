package model;

import java.io.Serializable;

import javax.enterprise.context.Dependent;

@Dependent
public class Motor implements Serializable{

	private int ccm;
	private int zylinder;
	public int getCcm() {
		return ccm;
	}
	public void setCcm(int ccm) {
		this.ccm = ccm;
	}
	public int getZylinder() {
		return zylinder;
	}
	public void setZylinder(int zylinder) {
		this.zylinder = zylinder;
	}
	
	public Motor() {
		this.setCcm(5000);
		this.setZylinder(12);
	}
	@Override
	public String toString() {
		return "Motor [ccm=" + ccm + ", zylinder=" + zylinder + "]";
	}
	
	
	
}
