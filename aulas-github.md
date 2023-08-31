# Git e GitHub - Versionamento | Trabalhando com repositórios
> [Digital Innovation One](https://www.dio.me)

## Documentação Oficial
- [Documentação Git](https://git-scm.com/doc)
- [Documentação GitHub](https://docs.github.com/pt)

### Versionamento de Código
Versionar código é criar um registro histórico das alterações nesse código. As ferramentas disponíveis trabalham com repositórios locais e remotos.

### Comandos mais conhecidos
| Comando | Explicação |
| ------ | --------- |
| git init                                         | Inicia um repositório local na pasta atual |
| git remote add origin [link do repositório]      | Configura o repositório do link como o repositório remoto a ser utilizado. |
| git add . ou git add *                           | Atualiza o status dos arquivos (modificação, adição, etc.) e os arquivos ficam preparados para serem enviados ao repositório remoto. |
| git reset [nome do arquivo]                      | Desfaz o git add para o arquivo nomeado. |
| git reset                                        | Desfaz o git add para todos os arquivos. |
| git commit -m "Mensagem que você quer adicionar" | Adiciona uma mensagem que será exibida como uma explicação do que foi alterado ou estado atual. |
| git commit -amend -m "Nova mensagem"             | Altera a mensagem do último commit. |
| git push                                         | Envia os arquivos do repositório local para o remoto. |
| git pull                                         | Traz as alterações do repositório remoto para o local. |
| git clone [link do repositório]                  | Faz uma cópia de um repositório remoto para a pasta escolhida. |
| git checkout -b [nome da branch]                 | Cria nova branch com o nome selecionado. |
| git checkout [nome da branch]                    | Retorna para a branch selecionada. |
| git merge [nome da branch]                       | Mistura a branch nomeada com a branch main. |
| git branch -d [nome da branch]                   | Deleta a branch selecionada. |