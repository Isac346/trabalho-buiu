function criaCartao(categoria, pergunta, resposta) {
    let container = document.getElementById('container')
    let cartao = document.createElement('article')
    cartao.className = 'cartao'

    cartao.innerHTML = `
    <div class="cartao__conteudo">
        <h3>${categoria}</h3>
        <div class="cartao__conteudo__pergunta">
            <p>${pergunta}</p>
        </div>
        <div class="cartao__conteudo__resposta">
            <p>${resposta}</p>
        </div>
    </div>
    `

    let respostaEstaVisivel = false

    function viraCartao() {
        respostaEstaVisivel = !respostaEstaVisivel
        cartao.classList.toggle('active', respostaEstaVisivel)
    }
    cartao.addEventListener('click', viraCartao)

    container.appendChild(cartao)
}

// Criando FlashCards de Clash Royale
criaCartao('Tropas', 'Qual tropa de custo mais baixo pode ser usada para ciclar o deck?', 'Esqueletos (1 de Elixir).')
criaCartao('Feitiços', 'Qual feitiço redefine ataques como o Sparky?', 'O Zap (Choque).')
criaCartao('Edifícios', 'Qual edifício gera esqueletos continuamente?', 'Lápide.')
criaCartao('Estratégia', 'Qual o termo para esperar elixir do oponente subir antes de atacar?', 'Coletar elixir.')
criaCartao('Cartas Lendárias', 'Qual carta lendária voa e dispara raios?', 'Dragão Infernal.')
criaCartao('Mecânicas de Jogo', 'O que acontece se ninguém destruir torres e o tempo acabar?', 'Prorrogação ou empate.')
criaCartao('Curiosidade do Jogo', 'Qual tropa tem um escudo que deve ser destruído primeiro?', 'Príncipe, Cavaleiro de Porco ou Golem.')
criaCartao('Objetivo', 'Qual é o objetivo principal do jogo?', 'Destruir a Torre do Rei do seu oponente.')
