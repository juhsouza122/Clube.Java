package comPermissaoAoClube;

import java.time.LocalDate;

public class CartaoDeSocio implements CartaoDeAcesso{
	private int id;
	
	public CartaoDeSocio(int id) {
		this.id = id;
	}

	@Override
	public boolean poderaEntrar(LocalDate localDate) {
		return localDate != null && id > -1;
	}
}
