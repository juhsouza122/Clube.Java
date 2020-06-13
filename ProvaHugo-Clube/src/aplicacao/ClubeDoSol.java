package aplicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import integrantes.Cartao;
import integrantes.Visitante;
import semPermissaoDoClube.SemPermissao;

public class ClubeDoSol {
	private List<Permissao> permissao = new ArrayList<Permissao>();
	
	private boolean permissaoParaEntrar(Cartao cartao) {
		return cartao.getCartaoDeAcesso().poderaEntrar(LocalDate.now());
	}
	
	public void acessoNovo(Cartao cartao) throws SemPermissao{
		if (!permissaoParaEntrar(cartao)) {
			throw new SemPermissao("Você não tem permissão para acessar o Clube hoje!!");
		}
		
		permissao.add(new Permissao(cartao, LocalDate.now()));
	}
	
	public List<Visitante> getVisitantes(final LocalDate localDate){
		if(localDate == null) {
			return permissao.stream().filter(permissao -> permissao.getCartao() instanceof Visitante).map(permissao -> (Visitante) permissao.getCartao()).collect(Collectors.toList());
		}else {
			return permissao.stream().filter(permissao -> permissao.getCartao() instanceof Visitante && permissao.getLocalDate().equals(localDate)).map(permissao -> (Visitante) permissao.getCartao()).collect(Collectors.toList());
		}
	}
	
	public long totalAcessoCartao(Class<? extends Cartao > clazz) {
		return permissao.stream().filter(permissao -> clazz.isAssignableFrom(permissao.getCartao().getClass())).count();
	}
}
