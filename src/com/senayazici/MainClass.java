package com.senayazici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	private static void printVariants(List<String> renkList, List<String> kumasList, List<String> bedenList) {

		try {
			if (renkList.size() == 0) {

				System.out.println("Lutfen renk bilgisi giriniz");

			}
			
			if (kumasList.size() == 0) {
				
				System.out.println("Lutfen kumas bilgisi giriniz");
			}
			
			if (bedenList.size() == 0) {
				
				System.out.println("Lutfen beden bilgisi giriniz");
			} 
			
			else {

				for (String renk : renkList) {

					for (String kumas : kumasList) {

						for (String beden : bedenList) {
							
							System.out.println(renk + " - " + kumas + " - "
									+ beden);

						}
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();

			System.err.println("Lutfen girdiginiz urun bilgilerini kontrol edin. Hata detayi :  "
							+ e);
		}

	}

	public static void main(String[] args) {

		List<String> renkList = new ArrayList<>();
		 //renkList.add("Kýrmýzý");
		 //renkList.add("Turuncu");

		List<String> kumasList = new ArrayList<>();

		 //kumasList.add("Keten");
		 //kumasList.add("Pamuk");
	
		List<String> bedenList = new ArrayList<>();

		 //bedenList.add("XS");
		 //bedenList.add("S");
		
		
	// EGER KULLANICIDAN BILGI ALINACAKSA	
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Aralarinda bir bosluk birakarak renk bilgisi giriniz: ");
		
		String renkInput = reader.nextLine();
		
		if(!renkInput.isEmpty()){
			
			renkList.addAll(Arrays.asList(renkInput.split("\\s+")));
		}
		
		System.out.println("Aralarýnda bir bosluk býrakarak kumas bilgisi giriniz: ");

		String kumasInput = reader.nextLine();

		if (!kumasInput.isEmpty()) {
		kumasList.addAll(Arrays.asList(kumasInput.split("\\s+")));

		}
		System.out.println("Aralarýnda bir bosluk býrakarak beden bilgisi giriniz: ");
		String bedenInput = reader.nextLine();

		if (!bedenInput.isEmpty()) {

		bedenList.addAll(Arrays.asList(bedenInput.split("\\s+")));

		}

		reader.close();
		
		printVariants(renkList,kumasList,bedenList);
	}
}
