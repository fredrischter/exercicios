Pra não ser uma solução trivial apenas, vou colocar os seguintes objetivos adicionais:

Cada exploração será considerada uma "Cena", que ocorrerá e poderá ser acompanhada em tempo real, sendo identificada por um nome dado.

Haverá interface web gráfica para visualizar a cena no estágio atual, próximos passos, voltar e avançar com controles web fáceis de usar.

Todas as cenas serão armazenadas em um banco SQLLite.

Começando implementação com uma aplicação springboot como "Hello world", já com um serviço rest pra criação de cenas.

Para executar:

mvn spring-boot:run

Acessar no browser:

http://localhost:8080/cena

Testar:

mvn test
