package br.mg.marlon.tests;

import org.junit.Assert;
import org.junit.Test;

import br.mg.marlon.core.BaseTest;
import br.mg.marlon.core.Propriedades;
import br.mg.marlon.pages.ContasPage;
import br.mg.marlon.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}
