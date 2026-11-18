# Anotação da sessão

Exemplo com HTML, CSS e JavaScript puro, sem bibliotecas e sem comentários no código.

## O que é sessionStorage?

É um recurso do navegador que guarda informações como pares de chave e valor em texto. Os dados pertencem à origem do site e à sessão da aba: continuam disponíveis ao recarregar a página e são apagados quando a sessão da aba termina. Não é necessário um banco de dados.

## Lógica do código

O HTML contém o formulário e a área que exibe a anotação. O CSS cuida da aparência e adapta a página ao celular. O JavaScript usa a chave `anotacaoDaSessao` para:

- Salvar o texto com `sessionStorage.setItem()`.
- Recuperar e exibir o texto com `sessionStorage.getItem()`, pelo botão Recuperar ou ao carregar a página.
- Apagar apenas a anotação com `sessionStorage.removeItem()`.

O código impede salvar somente espaços, mostra mensagens de resultado e trata falhas de acesso ao armazenamento. O texto é exibido com `textContent`.

## Como executar e demonstrar

Abra a pasta no VS Code e use a extensão Live Server para abrir o `index.html` em um servidor local. Abrir diretamente pelo caminho `file://` pode bloquear o armazenamento em alguns navegadores.

1. Digite `Estudar JavaScript` e clique em **Salvar anotação**. O texto aparece em “Informação armazenada”.
2. Altere o campo sem salvar e clique em **Recuperar**. O texto salvo volta para o campo.
3. Recarregue a página. A anotação é recuperada automaticamente.
4. Clique em **Apagar** e recarregue. A anotação não aparece mais.
5. Salve novamente, feche a aba e abra o endereço em uma aba nova, sem restaurar a anterior. Uma nova sessão começa sem a anotação.

## Arquivos

- `index.html`: estrutura da página.
- `style.css`: aparência.
- `script.js`: armazenamento e interação.

Fonte: [MDN — Window.sessionStorage](https://developer.mozilla.org/en-US/docs/Web/API/Window/sessionStorage).
