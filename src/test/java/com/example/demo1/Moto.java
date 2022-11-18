package com.example.demo1;

import java.util.Random;
	public abstract class Moto implements Cloneable {
		protected String modelo;
		public int precio;
		private int anio;
		
		public Moto clone() throws CloneNotSupportedException{
			return (Moto)super.clone();
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getPrecio() {
			return precio;
		}

		public static int setPrecio() {
			int p=0;
			Random r= new Random();
			p=r.nextInt(10000);
			return p;
		}

		public int getAnio() {
			return anio;
		}

		public void setAnio(int anio) {
			this.anio = anio;
		}

	}
