# language: pt
@locadora
Funcionalidade: Alugar filme
	Como um usuário
	Eu quero cadastrar aluguéis de filmes
	Para controlar preços e datas de entrega    

Cenário: Deve alugar um filme com sucesso
 	Dado um filme
 		| estoque | 2 |
 		| preco   | 3 |
 	E que o preço do aluguel seja R$3
 	Quando alugar
 	Então o preço do aluguel será R$3
 	E a data de entrega será em 1 dia
 	E o estoque do filme será de 1 unidade
 	
#Cenário: Deve alugar um filme com sucesso
# 	Dado um filme com estoque de 2 unidades
# 	E que o preço do aluguel seja R$3
# 	Quando alugar
# 	Então o preço do aluguel será R$3
# 	E a data de entrega será em 1 dia
# 	E o estoque do filme será de 1 unidade

Cenário: Não deve alugar um filme sem estoque
 	Dado um filme com estoque de 0 unidades
 	Quando alugar
 	Então não será possível por falta de estoque
 	E o estoque do filme será de 0 unidade

#Scenario Outline
Esquema do Cenário: Deve dar condições conforme tipo de aluguel
	Dado um filme com estoque de 2 unidades
 	E que o preço do aluguel seja R$<precoUnitario>
 	E que o tipo do aluguel seja <tipo>
 	Quando alugar
 	Então o preço do aluguel será R$<valorTotal>
 	E a data de entrega será em <qtdDias> dias
 	E a pontuação recebida será de <pontuacao> pontos

Exemplos: 	
 	| precoUnitario | tipo 		| valorTotal	| qtdDias | pontuacao |
 	|			4					|extendido|			8				|		3			|			2			|
 	|			4					|comum		|			4				|		1			|			1			|
 	|			5					| semanal |			15			|		7			|			3			|
 	
#Cenário: Deve dar condições especiais para categoria extendida
# 	Dado um filme com estoque de 2 unidades
# 	E que o preço do aluguel seja R$4
# 	E que o tipo do aluguel seja extendido
# 	Quando alugar
# 	Então o preço do aluguel será R$8
# 	E a data de entrega será em 3 dias
# 	E a pontuação recebida será de 2 pontos
# 	
#Cenário: Devel alugar para categoria comum
#	Dado um filme com estoque de 2 unidades
#	E que o preço do aluguel seja R$4
#	E que o tipo do aluguel seja comum
#	Quando alugar
#	Então o preço do aluguel será R$4
#	E a data de entrega será em 1 dia
#	E a pontuação recebida será de 1 ponto