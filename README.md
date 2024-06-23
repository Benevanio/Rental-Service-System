# Rental Service System

Este é um sistema simples de aluguel de veículos que calcula o valor do aluguel com base no modelo do carro, no período de aluguel e nas taxas de aluguel por hora e por dia.

## Entidades

### CarRental

Representa um aluguel de carro e contém informações sobre o início e o fim do aluguel, o veículo alugado e a fatura associada.

### Vehicle

Representa um veículo e contém informações sobre o modelo do veículo.

### Invoice

Representa uma fatura e contém informações sobre o pagamento básico e os impostos associados ao aluguel.

## Serviços

### RentalService

Responsável por processar o aluguel, calcular o pagamento básico com base no período de aluguel e nas taxas de aluguel, e calcular os impostos usando o serviço de impostos do Brasil.

### BrazilTaxService

Implementa a interface TaxService e fornece a lógica para calcular os impostos com base no valor do pagamento básico.

### TaxService

Interface que define o método para calcular os impostos.

## Como usar

1. Clone o repositório.
2. Abra o projeto em sua IDE favorita.
3. Execute a classe `App` para iniciar o sistema de aluguel.

O sistema solicitará o modelo do carro, as datas de retirada e devolução, o preço por hora e o preço por dia. Em seguida, calculará e exibirá a fatura com o pagamento básico, os impostos e o pagamento total.

Divirta-se alugando carros!