package integrantes;

import comPermissaoAoClube.CartaoDeAcesso;
import comPermissaoAoClube.CartaoDeSocio;

public class Socio implements Cartao{
	private CartaoDeSocio cartaoDeSocio;
	
	public Socio(int id) {
		this.cartaoDeSocio = new CartaoDeSocio(id);
	}

	@Override
	public CartaoDeAcesso getCartaoDeAcesso() {
		return cartaoDeSocio;
	}
	
	
}
