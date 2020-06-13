package integrantes;

import comPermissaoAoClube.CartaoDeAcesso;
import comPermissaoAoClube.Convite;

public class Visitante implements Cartao{
	private Convite convite;
	
	public Visitante(Convite convite) {
		this.convite = convite;
	}

	@Override
	public CartaoDeAcesso getCartaoDeAcesso() {
		return convite;
	}
	
	
}
