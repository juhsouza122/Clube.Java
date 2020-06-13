package comPermissaoAoClube;

import java.time.LocalDate;

public class Convite implements CartaoDeAcesso{
	private int num;
	private LocalDate localDate;
	
	public Convite(int num, LocalDate localDate) {
		this.setNum(num);
		this.localDate = localDate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean poderaEntrar(LocalDate localDate) {
		return this.localDate.equals(localDate);
	}
}
