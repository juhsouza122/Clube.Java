package aplicacao;

import integrantes.Cartao;
import java.time.LocalDate;

public class Permissao {
	private Cartao cartao;
	private LocalDate localDate;
	
	public Permissao(Cartao cartao, LocalDate localDate) {
		this.cartao = cartao;
		this.localDate = localDate;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}
}
