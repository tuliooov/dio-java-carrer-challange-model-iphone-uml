package apps.telefonia;

public class Telefone implements AparelhoTelefonico {
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
	}

	public void atender() {
		System.out.println("Ligação atendida.");		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");		
	}
	
}
