package com.animales.examen3;

public class Colibri extends Animales {
	
	int alasCount = 2;
	String colorPrincipal = "azul";
	
	
	public int getAlasCount() {
		return alasCount;
	}
	public void setAlasCount(int alasCount) {
		this.alasCount = alasCount;
	}
	
	public String getColorPrincipal() {
		return colorPrincipal;
	}
	public void setColorPrincipal(String colorPrincipal) {
		this.colorPrincipal = colorPrincipal;
	}
	
	
	public void volar() {
		System.out.println("Mover alas");
	}
	public void cantar() {
		System.out.println("Pio pio");
	}
}