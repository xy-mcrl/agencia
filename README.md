# agencia

## Criar um grupo no Maven
  mvn archetype:generate -DgroupId=br.com.senai -DartifactId=agencia -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

  ## Acessar o projeto
  cd nome_do_projeto

  ## Inicializar o versionamento
   git init

   ## Adicionar os arquivos do projeto
   git add . (o ponto informar que ira adicionar tudo)

   ## Colocar um comentario no versionamento
    git commit -m "coloque o seu comentario"
   
   ## Criar um repositorio na minha conta do GitHub com nome do projeto
    Ex.: agencia | agenciaRh ou agencia-rh

   ## Capturar o link do git remote em ssh
   
    Ex.:git@github.com:xy-mcrl/agencia.git

   ## Subir o projeto para GitHub
      git push -u origin 