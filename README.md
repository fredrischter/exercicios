Ia criar uma interface gráfica web e também um banco de dados, porém observei que talvez isso saia do escopo necessário para o teste, desta forma, deixei como extra apenas o serviço web que pode ser acessado pelo browser;

Deixei como opção a execução via comando, que processa cada linha de entrada e entrega a resposta, uma linha vazia encerra a execução.

----- Para executar como aplicação web:

mvn spring-boot:run

Acessar no browser:

http://localhost:8080/cena?entrada=DDDDRRMUULMMM

----- Para executar via comando:

mvn package
java -jar target\submarino-0.1.0.jar

LLLL
0 0 0 NORTE
DDDDUU
0 0 -2 NORTE
LLMDDLMMDDDD
2 -1 -6 LESTE

----- Para executar teste unitário:

mvn test
