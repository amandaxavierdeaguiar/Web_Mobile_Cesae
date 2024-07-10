## 📚 Documentação Git

- [Documentação Git](https://git-scm.com/doc)
- [Documentação GitHub](https://docs.github.com/pt)

## 👉 Alguns Comandos Git

### Git config

```
git config --global user.name "Amanda Aguiar"
git config --global user.email amandaaguiar@example.com
``` 

### Git help

```
git help {comando}
git {comando} --help
man git- {comando}
```

### Repositório Local

**Criar novo repositório**

```
git init
```

**Verificar estado dos arquivos/diretórios**
```
git status
``` 

### Adicionar arquivo/diretório 

**Adicionar um arquivo em específico**
```
git add meu_arquivo.txt
```

**Adicionar um diretório em específico**

```
git add meu_diretorio
```
**Adicionar todos os arquivos/diretórios**
```
git add .	
```
**Adicionar um arquivo que esta listado no .gitignore **
```
git add -f arquivo_no_gitignore.txt
```
### Comitar arquivo/diretório
**Comitar um arquivo**
```
git commit meu_arquivo.txt
``` 
**Comitar vários arquivos**
```
git commit meu_arquivo.txt meu_outro_arquivo.txt
```
**Comitar informando mensagem**
```
git commit meuarquivo.txt -m "minha mensagem de commit"
```
### Remover arquivo/diretório

**Remover arquivo**
```
git rm meu_arquivo.txt
```
**Remover diretório**
```
git rm -r diretorio
```
### Visualizar histórico
**Exibir histórico**
``` 
git log
```
**Exibir histórico com diff das duas últimas alterações**
```
git log -p -2
```
**Exibir resumo do histórico (hash completa, autor, data, comentário e qtde de alterações (+/-))**
```
git log --stat
```

**Exibir informações resumidas em uma linha (hash completa e comentário)**
```
git log --pretty=oneline
```
**Exibir histórico com formatação específica (hash abreviada, autor, data e comentário)**
```
git log --pretty=format:"%h - %an, %ar : %s"
```
- *%h: Abreviação do hash;*
- *%an: Nome do autor;*
- *%ar: Data;*
- *%s: Comentário.*

**Exibir histório de um arquivo específico**
```
git log -- <caminho_do_arquivo>
```

**Exibir histórico de um arquivo específico que contêm uma determinada palavra**
```
git log --summary -S<palavra> [<caminho_do_arquivo>]
```
**Exibir histórico modificação de um arquivo**
```
git log --diff-filter=M -- <caminho_do_arquivo>
```
Pode ser substituido por: Adicionado (A), Copiado (C), Apagado (D), Modificado (M), Renomeado (R), entre outros.

**Exibir histório de um determinado autor**
```
git log --author=usuario
```
**Exibir revisão e autor da última modificação de uma bloco de linhas**
```
git blame -L 12,22 meu_arquivo.txt 
```
### Desfazendo operações

**Desfazendo alteração local**

Este comando deve ser utilizando enquanto o arquivo não foi adicionado na staged area.
```
git checkout -- meu_arquivo.txt
```
**Desfazendo alteração local (staging area)**

Este comando deve ser utilizando quando o arquivo já foi adicionado na staged area.
```
git reset HEAD meu_arquivo.txt
```
Se o resultado abaixo for exibido, o comando reset não alterou o diretório de trabalho.

```
Unstaged changes after reset:
M	meu_arquivo.txt
```
**A alteração do diretório pode ser realizada através do comando abaixo:**
```
git checkout meu_arquivo.txt
```

### Repositório Remoto
**Exibir os repositórios remotos**
```
git remote

git remote -v
```
**Vincular repositório local com um repositório remoto**
```
git remote add origin https://github.com/amandaxavierdeaguiar/ciencia-de-dados-com-python.git
```
**Exibir informações dos repositórios remotos**
```
git remote show origin
```
**Renomear um repositório remoto**
```
git remote rename origin curso-git
```
**Desvincular um repositório remoto**
```
git remote rm curso-git
```
### Enviar arquivos/diretórios para o repositório remoto

O primeiro push de um repositório deve conter o nome do repositório remoto e o branch.
```
git push -u origin master
```
Os demais pushes não precisam dessa informação
```
git push
```
### Atualizar repositório local de acordo com o repositório remoto
**Atualizar os arquivos no branch atual**
```
git pull
```
Buscar as alterações, mas não aplica-las no branch atual
```
git fetch
```
**Clonar um repositório remoto já existente**

Você clona um repositório com git clone [url].
```
git clone https://github.com/amandaxavierdeaguiar/blablabla.git
```
### Tags
**Criando uma tag leve**
```
git tag vs-1.1
```
**Criando uma tag anotada**
```
git tag -a vs-1.1 -m "Minha versão 1.1"
```
**Criando uma tag assinada**
Para criar uma tag assinada é necessário uma chave privada (GNU Privacy Guard - GPG).
```
git tag -s vs-1.1 -m "Minha tag assinada 1.1"
```
**Criando tag a partir de um commit (hash)**
```
git tag -a vs-1.2 9fceb02
```
**Criando tags no repositório remoto**
```
git push origin vs-1.2
```
**Criando todas as tags locais no repositório remoto**
```
git push origin --tags
```
### Branches

O **master** é o *branch principal do GIT.*

O HEAD é um ponteiro especial que indica qual é o branch atual. Por padrão, o HEAD aponta para o branch principal, o master.

**Criando um novo branch**
```
git branch exemp-123
```
**Trocando para um branch existente**
```
git checkout exemp-123
```
Neste caso, o ponteiro principal HEAD esta apontando para o branch chamado exemp-123.

**Criar um novo branch e trocar**
```
git checkout -b exemp-456
```
**Voltar para o branch principal (master)**
```
git checkout master
```
**Resolver merge entre os branches**
```
git merge exemp-123
```
Para realizar o merge, é necessário estar no branch que deverá receber as alterações. O merge pode automático ou manual. O merge automático será feito em arquivos textos que não sofreram alterações nas mesmas linhas, já o merge manual será feito em arquivos textos que sofreram alterações nas mesmas linhas.

A mensagem indicando um merge manual será:

```
Automerging meu_arquivo.txt
CONFLICT (content): Merge conflict in meu_arquivo.txt
Automatic merge failed; fix conflicts and then commit the result.
```
**Apagando um branch**
```
git branch -d exemp-123
```
### Listar branches
**Listar branches**
```
git branch
```
**Listar branches com informações dos últimos commits**
```
git branch -v
```
**Listar branches que já foram fundidos (merged) com o master**
```
git branch --merged
```
**Listar branches que não foram fundidos (merged) com o master**
```
git branch --no-merged
```
### Criando branches no repositório remoto
**Criando um branch remoto com o mesmo nome**
```
git push origin exemp-123
```
**Criando um branch remoto com nome diferente**
```
git push origin exemp-123:new-branch
```
**Baixar um branch remoto para edição**
```
git checkout -b exemp-123 origin/exemp-123
```

**Apagar branch remoto**
```
git push origin:exemp-123
```


## 👉 Referencias

[Codigos Git - Contribuição Leocomelli](https://gist.github.com/leocomelli/2545add34e4fec21ec16)

[Curso Git GitHub - Elidiana Andrade](https://github.com/elidianaandrade/dio-curso-git-github)
