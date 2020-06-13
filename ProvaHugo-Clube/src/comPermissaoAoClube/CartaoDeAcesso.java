package comPermissaoAoClube;

import java.time.LocalDate;

public interface CartaoDeAcesso {
	public boolean poderaEntrar(LocalDate localDate);
}
