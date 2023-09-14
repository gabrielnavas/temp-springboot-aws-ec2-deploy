
1. Crie um projeto ou tenha o projeto Spring Boot em mãos.
	1. Configure a porta do projeto para 80. em application.properties adicione => server.port=80
	   
2. Tenha uma instância limpa na AWS (ubuntu ou debian)
   1. Vá em Security -> Security Groups -> Edit inbound rules
	2. Abra a porta HTTP, Type Http, Protocol TCP, port range 80, source 0.0.0.0/0 
	3. Clique em Save rules
	   
3. Faça o deploy do projeto no Github
	1. Vá em Settings do projeto no Github
	2. Procure por Code and automation -> Actions --> Runners 
	3. Clique em New self-hosed runner
	4. Selecione Linux como Runner image
	   
4. Faça o SSH no servidor na AWS
   
5. Copie os passo a passo do Github Runners até o Last step em vez de ./run execute sudo ./svc.sh start 
   
6. Vá para o seu projeto -> Actions -> Java with Maven -> Configure
	1. mude jobs.build.runs-on=self-hosted
	2. delete o on.pull_request
	   
7. Ainda no Configure, clique em Commit changes -> Commit changes
   
8. Dentro do servidor na AWS execute:
	1. sudo apt update -y
	2. sudo apt install maven  openjdk-17-jdk openjdk-17-jre

9. Faça o push das novas atualizações do projeto, devera ser feito automagicamente o deploy no servidor.

#### Fonte do tutorial
[Usei esse vídeo](https://www.youtube.com/watch?v=1-CKqngg6GY&t=1217s)
