package br.com.claudiowork.entidades;

import java.math.BigDecimal;

public class Filme {

	private Long id;
	private Long estoque;
	private BigDecimal valorAluguel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstoque() {
		return estoque;
	}

	public void setEstoque(Long estoque) {
		this.estoque = estoque;
	}

	public BigDecimal getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(BigDecimal valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

}
