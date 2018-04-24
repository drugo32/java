package it.engim.util;

public class quadrilatero {


	private double Base;
	private double Altezza;
	
	public quadrilatero(double b, double a) {
		this.Base = b;
		this.Altezza = a;
	}
	/*
	* 0 se sono uguali
	* >0 se il primo è più grande del secondo
	* <0 se il primo è più piccolo del secondo.
	*/
	public double GetDiff(quadrilatero q2) {
		double a1 = this.GetArea(); 
		double a2 = q2.GetArea();
		return a1 - a2;
	}
	
	public double GetArea() {
		return this.Altezza * this.Base;
	}
	
	public double GetAltezza() {
		return this.Altezza;
	}
	
	public double GetBase() {
		return this.Base;
	}
	
	public String toString() {
		return "Base: " + this.Base + " Altezza: " + this.Altezza;
	}

}
