package com.example.demo1;

public class AppMotos {
	
	public static void main (String [] args) throws CloneNotSupportedException{
		
		Moto t1=new Suzuki("Fortuner");
		t1.precio=50000;
		t1.setAnio(2021);
		
		Moto f1=new Yamaha("Focus");
		f1.precio=40000;
		f1.setAnio(2020);
		
		Moto clonado;
		clonado=t1.clone();
		System.out.println(t1.getModelo()+" "+t1.getAnio()+" "+t1.getPrecio());
		clonado.precio=t1.precio+Moto.setPrecio();
		System.out.println(clonado.getModelo()+" "+clonado.getAnio()+" "+clonado.getPrecio());
	}

}
