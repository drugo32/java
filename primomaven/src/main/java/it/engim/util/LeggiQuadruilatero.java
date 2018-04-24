package it.engim.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeggiQuadruilatero {

	/*
	* 0 se sono uguali
	* -1 se il primo è più grande del secondo
	* 1 se il primo è più piccolo del secondo.
	*/
	public static int QuadrilateroDiff(quadrilatero q1, quadrilatero q2) {
		double diff = q1.GetDiff(q2);
		if(diff < 0) {return -1;}
		if(diff > 0) {return 1;}
		return 0;
	}
	
	public static double GetInput(Scanner s, String label) {
		// Scanner s = new Scanner(System.in);
		System.out.println(label);
		if(s.hasNext() && !s.hasNextDouble()) {
			s.next();
			return GetInput(s,label);
		}
		return s.nextDouble();
	}
	
	public static quadrilatero Getquadrilatero(String l) {
		System.out.println(l);
		Scanner s = new Scanner(System.in);
		double altezza	= GetInput(s, "Inserisci l'altezza:");
		double base	= GetInput(s, "Inserisci la base:");
		return new quadrilatero(base, altezza);
	}
	

	public static void LodDiff(quadrilatero q1,quadrilatero q2) {
		int diff = QuadrilateroDiff(q1,q2);
		if(diff == 1) {
			System.out.println("il primo < secondo.");	
		}
		else if(diff == -1) {
			System.out.println("il primo > secondo.");	
		}
		else {
			System.out.println("Sono uguali");	
		}
	}

	
	public static void Log(quadrilatero q) {
		System.out.println(q.toString());
		System.out.println("Area: "+ q.GetArea());
	} 
	
	public static void LogFile(quadrilatero q, File file) {
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(file);
			printWriter.println(q.toString());
			printWriter.println("Area: "+ q.GetArea());
			printWriter.close ();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static quadrilatero GetMaxArea(quadrilatero Qa[]) {
		int le = Qa.length;
		quadrilatero q = Qa[0];
		for (int i=1; i<le-1; i++) {
			if (QuadrilateroDiff(q, Qa[i]) == -1) {
				q=Qa[i];
			}
		}
		return q;
	}
	
	public static void main(String[] args) {
		
		int x = 5;
		quadrilatero qmax;
		quadrilatero Qarr[] = new quadrilatero[x];
		
		for(int i=0; i<x-1; i++) {
			Qarr[i] = Getquadrilatero("Inserisci il n-"+i+"q\n");
		}
		for(int i=0; i<x-1; i++) {
			Log(Qarr[i]);
		}
		
		System.out.println("MAx\n");
		qmax = GetMaxArea(Qarr);
		Log(qmax);
		
		
		File file = new File ("/home/mobile/Scrivania/test.txt");
		LogFile(qmax, file);

		
	}

}
