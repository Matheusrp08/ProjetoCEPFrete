# ProjetoCEPFrete

Calcular o valor total do frete e a data prevista da entrega...

O que preciso fazer ainda

CEPs com DDDs iguais tem 50% de desconto no valor do frete e entrega prevista de 1 dia

CEPs de estados iguais tem 75% de desconto no valor do frete e entrega prevista de 3 dias

CEPs de estados diferentes não deve ser aplicado o desconto no valor do frete e entrega prevista de 10 dias

O valor do frete é cobrado pelo peso da encomenda, o valor para cada KG é R$1,00

Input de entrada deve ser “peso”, “cepOrigem”, “cepDestino” e “nomeDestinatario“

Endpoint pode ser público Response/Output deve possuir: “vlTotalFrete” e “dataPrevistaEntrega”, “cepOrigem” e “cepDestino” Deve ser persistido no banco os valores da cotação os valores consultados: “peso”, “cepOrigem”, “cepDestino”, “nomeDestinatario”, “vlTotalFrete”, “dataPrevistaEntrega” e “dataConsulta”
