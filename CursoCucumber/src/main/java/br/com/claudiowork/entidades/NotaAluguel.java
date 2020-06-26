package br.com.claudiowork.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class NotaAluguel {

	private BigDecimal preco;
	private int pontuacao;
	private Date dataEntrega;
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}
	
	public void setPontuacao(int pont) {
		// TODO Auto-generated method stub
		this.pontuacao = pont;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public Date getDataEntrega() {
		return this.dataEntrega;
	}
}
