package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import Adidas.AdidasFactory;
import Boss.BossFactory;
import Clothes.Jasper;
import Factory.IClothingFactory;
import creator.Creator;

public class main {

	public static void main(String[] args) {
		
		Class<?> c = null; 
		
		Creator crea = new Creator();
		//IClothingFactory clthsFac = new BossFactory();
		//IClothingFactory clthsFac = new AdidasFactory();
		IClothingFactory clthsFac = null ;
		
		
		Properties properties = new Properties();
		 try {
		 properties.load(
		 new FileInputStream("tehdas.properties"));
		} catch (IOException e) {e.printStackTrace();}
		 try{
		//luetaan toteuttava tehdas properties-tiedostosta
		 c = Class.forName(properties.getProperty("tehdas"));
		 System.out.println("c" + c);
		 clthsFac = (IClothingFactory) c.getDeclaredConstructor().newInstance();
		 }catch (Exception e){e.printStackTrace();}
	
		
		crea.setClothingFactory(clthsFac);
		crea.constructClothes();

		System.out.println(clthsFac.getClothes());
        // Printing the read line
       
		
	
		
		/*
		Jasper jspr = (Jasper) clthsFac.getClothes();
		System.out.println(jspr);
		*/
	
	}

}
