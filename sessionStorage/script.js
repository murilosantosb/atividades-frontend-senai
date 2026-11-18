const formulario = document.getElementById("formulario");
const anotacao = document.getElementById("anotacao");
const conteudoSalvo = document.getElementById("conteudo-salvo");
const mensagem = document.getElementById("mensagem");
const chave = "anotacaoDaSessao";

function informarErro() {
  mensagem.textContent = "Não foi possível acessar o sessionStorage. Verifique as permissões do navegador e use um servidor local.";
}

function recuperarAnotacao() {
  try {
    const texto = sessionStorage.getItem(chave);
    anotacao.value = texto ?? "";
    conteudoSalvo.textContent = texto ?? "Sua anotação aparecerá aqui.";
    mensagem.textContent = texto !== null
      ? "Anotação recuperada do sessionStorage."
      : "Nenhuma anotação salva nesta sessão.";
  } catch {
    informarErro();
  }
}

formulario.addEventListener("submit", (evento) => {
  evento.preventDefault();
  const texto = anotacao.value.trim();

  if (!texto) {
    mensagem.textContent = "Digite uma anotação antes de salvar.";
    anotacao.focus();
    return;
  }

  try {
    sessionStorage.setItem(chave, texto);
    anotacao.value = texto;
    conteudoSalvo.textContent = texto;
    mensagem.textContent = "Anotação salva! Recarregue a página para testar.";
  } catch {
    informarErro();
  }
});

document.getElementById("recuperar").addEventListener("click", recuperarAnotacao);

document.getElementById("apagar").addEventListener("click", () => {
  try {
    sessionStorage.removeItem(chave);
    anotacao.value = "";
    conteudoSalvo.textContent = "Sua anotação aparecerá aqui.";
    mensagem.textContent = "Anotação apagada desta sessão.";
    anotacao.focus();
  } catch {
    informarErro();
  }
});

recuperarAnotacao();
