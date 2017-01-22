package br.com.buscape;

import java.util.Scanner;
import br.com.buscape.Cena;

public class Main {
	public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	String linha;
    	
    	while(scanner.hasNextLine()) {
    		linha = scanner.nextLine();
    		if (linha.length() == 0) {
    			scanner.close();
    			return;
    		}

    		System.out.println(new Cena(linha));
    	}
    	
    }
}
