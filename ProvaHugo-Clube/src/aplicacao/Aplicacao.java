package aplicacao;

import java.time.LocalDate;

import comPermissaoAoClube.Convite;
import integrantes.Cartao;
import integrantes.Socio;
import integrantes.Visitante;
import semPermissaoDoClube.SemPermissao;

public class Aplicacao {
	public static void main(String[] args) {
		final ClubeDoSol clube = new ClubeDoSol();
		
		try {
			final Socio socio = new Socio(1);
			clube.acessoNovo(socio);
			
			System.out.println("--------Clube do Sol--------");
			System.out.println("\nVisitantes: " + clube.getVisitantes(LocalDate.now()));
			System.out.println("Total de acessos dos sócios: " + clube.totalAcessoCartao(Socio.class));
			System.out.println("Total de acessos dos visitantes: " + clube.totalAcessoCartao(Visitante.class));
			System.out.println("Total de acessos de integrantes do clube: " + clube.totalAcessoCartao(Cartao.class));
			
			final Visitante visitante1 = new Visitante(new Convite(1, LocalDate.now()));
			clube.acessoNovo(visitante1);
			
			System.out.println("--------Clube do Sol--------");
			System.out.println("\nVisitantes: " + clube.getVisitantes(LocalDate.now()));
			System.out.println("Total de acessos dos sócios: " + clube.totalAcessoCartao(Socio.class));
			System.out.println("Total de acessos dos visitantes: " + clube.totalAcessoCartao(Visitante.class));
			System.out.println("Total de acessos de integrantes do clube: " + clube.totalAcessoCartao(Cartao.class));
			
			final Visitante visitante2 = new Visitante(new Convite(1, LocalDate.of(2020, 12, 12)));
			clube.acessoNovo(visitante2);
			
		}catch (SemPermissao e) {
			System.out.println(e.getMessage());
		}
	}
}
