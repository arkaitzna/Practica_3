package com.animales.examen3;

public class MainExamen3 {
	public static void main(String[] args) {
		Colibri pajaro = new Colibri();
		pajaro.setName("Piolin");
		
		System.out.println( pajaro.getName() +" tiene "+ pajaro.getAlasCount() +" alas y es de color "+ pajaro.getColorPrincipal());
		pajaro.cantar();
		
		
		Leopardo leo = new Leopardo();
		leo.setName("Manchitas");
		
		System.out.println( leo.getName() +" tiene "+ leo.getOrejasCount() +" orejas y tiene "+ leo.getManchasCount() +" manchas");
		leo.caminar();
		
		
		Delfin pescao = new Delfin();
		pescao.setName("Rodolfo");
		
		System.out.println( pescao.getName() +" tiene "+ pescao.getAletasCount() +" aletas y "+ pescao.getOjosCount() +" ojo");
		pescao.nadar();
	}
}