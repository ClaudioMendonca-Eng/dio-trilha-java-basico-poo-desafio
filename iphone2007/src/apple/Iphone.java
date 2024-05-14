package apple;

import apple.navegador.NavegadorNaInternet;
import apple.reprodutorMusicial.ReprodutorMusicial;
import apple.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusicial, NavegadorNaInternet, AparelhoTelefonico {

    //implementação dos métodos da interface ReprodutorMusicial
    public void tocar() {
        System.out.println("Tocando música no Iphone");
    }
    public void pausar() {
        System.out.println("Pausando música no Iphone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música no Iphone");
    }

// implementação dos métodos da interface NavegadorNaInternet
    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone");
    }

// implementação dos métodos da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando Iphone");
    }
    public void atender() {
        System.out.println("Atendendo chamada no Iphone");
    }
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

}