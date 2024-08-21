package apps.musica;

public class Itunes implements ReprodutorMusical {
	public void tocar() {
		System.out.println("Tocando música selecionada");
	}
	public void pausar() {
		System.out.println("Música pausada.");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
	}
}
