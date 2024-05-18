# Exercício Altice Labs
Implementação de um serviço REST em Java que calcula valores da sequência LabSeq

# Labseq
Implemente um serviço REST, utilizando um framework JAVA, que retorne um valor da sequência labseq.

Opcionalmente, implemente uma GUI web simples em JavaScript para invocar o serviço. A sequência labseq - l(n) - é definida da seguinte forma:

- n=0 => l(0) = 0
- n=1 => l(1) = 1
- n=2 => l(2) = 0
- n=3 => l(3) = 1
- n>3 => l(n) = l(n-4) + l(n-3)

Exemplo dos primeiros valores da sequência:

0 <br>
1 <br>
0 <br>
1 <br>
1 <br>
1 <br> 
1 <br>
2 <br>
2 <br>
2 <br>
3 <br>
[...] <br>

O endpoint criado deve estar na forma /labseq/{n}, onde {n} representa o índice do valor único da sequência a ser retornado. O índice pode ser qualquer número inteiro não negativo.

O serviço implementado deve usar um mecanismo de cache para aproveitar cálculos anteriores e acelerar cálculos futuros. Esse mecanismo de cache deve ser usado nos cálculos intermediários do algoritmo (se aplicável), e não apenas nas invocações do endpoint. A resposta deve incluir:

Código fonte;
Documentação da API REST - formato Open API (Swagger);
Instruções de execução (contêineres ou outros);


Tecnologias
- Java 17
- Angular 17
- Spring Boot 3.2.5
- Git
- Docker
- Swagger
- Maven

<hr>

# Acesso ao Swagger:

Após iniciar os contêineres, você poderá acessar a interface do Swagger para explorar a API em seu navegador. Basta abrir o seguinte link: http://localhost:8080/swagger-ui/index.html

<hr>

# Docker

Para iniciar o projeto, primeiro, certifique-se de ter o Docker instalado em sua máquina. Em seguida, clone o repositório para o seu ambiente local. Navegue até o diretório raiz do projeto clonado e execute o comando docker-compose up. Isso iniciará os containers do front-end e do back-end, conforme definido no arquivo docker-compose.yml
