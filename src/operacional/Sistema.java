package operacional;

import apps.internet.NavegadorInternet;
import apps.multifuncional.Iphone;
import apps.musica.ReprodutorMusical;
import apps.telefonia.AparelhoTelefonico;

public class Sistema {
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		ReprodutorMusical itunes = iphone;
		AparelhoTelefonico telefone = iphone;
		NavegadorInternet safari = iphone;
		
		System.out.println("iTunes");
		itunes.tocar();
		itunes.pausar();
		itunes.selecionarMusica("The way you are");
		System.out.println();
		
		System.out.println("Telefone");
		telefone.ligar("1130009900");
		telefone.atender();
		telefone.iniciarCorreioVoz();
		System.out.println();
		
		System.out.println("Navegador Safari");
		safari.exibirPagina("www.google.com");
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		
	}

}
