# Testes Unitários para TrabalhoObserver
Este repositório contém testes unitários para o projeto TrabalhoObserver, que utiliza o padrão de design Observer para contar palavras em uma frase. Os testes garantem o funcionamento adequado das funcionalidades implementadas no código.

## Desenvolvido por:
- Joyce da Costa Dias

## Descrição dos Testes
1. **Adicionar Observador:**
   O teste adicionarObservavel verifica se é possível adicionar um observador à lista de observadores de um objeto Observavel. Ele cria um observador, adiciona-o ao objeto Observavel e verifica se a lista de observadores contém o observador adicionado.

2. **Remover Observador:**
   O teste removerObservavel verifica se é possível remover um observador da lista de observadores de um objeto Observavel. Ele cria um observador, adiciona-o ao objeto Observavel, remove o observador e verifica se a lista de observadores está vazia.

3. **Contar Todas as Palavras:**
   O teste contarTodasPalavras verifica se a função contarTodasPalavras do objeto Observavel conta corretamente o número total de palavras em uma frase.

4. **Palavras Par:**
   O teste palavrasPar verifica se a função palavrasPar do objeto Observavel conta corretamente o número de palavras com quantidades pares de caracteres em uma frase.

5. **Contar Palavras Maiúsculas:**
   O teste contarPalavrasMaiusculas verifica se a função contarPalavrasMaiusculas do objeto Observavel conta corretamente o número de palavras que começam com maiúsculas em uma frase.

6. **Notification:**
   O teste notification verifica se o método notification do objeto Observavel notifica corretamente todos os observadores adicionados. Ele cria dois observadores, adiciona-os ao objeto Observavel, chama o método notification e verifica se ambos os observadores foram notificados.


