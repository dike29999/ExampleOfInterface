package com.na.hinhtron;

public class HinhTron implements BoHVCVDT{
	private double r,cV,S;
	public void nhapR(double r) {
		this.r=r;
	}
	
	@Override
	public void tinhCV() {
		this.cV=Math.PI*r*2;
	}
	@Override
	public void tinhS(){
		this.S=Math.PI*r*r;
	}
	public void inTT() {
		System.out.println("r: "+r);
		System.out.println("CV: "+cV);
		System.out.println("S: "+S);
	}
}
