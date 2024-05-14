import apple.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphoneDoPedrinho = new Iphone();

        System.err.println("Reprodutor Musicial:");        
        System.err.println("--------------------------------");
        //Repodutor Musicial: tocar, pausar, selecionarMusica
        iphoneDoPedrinho.tocar();
        iphoneDoPedrinho.pausar();
        iphoneDoPedrinho.selecionarMusica();
        System.err.println("================================");

        System.err.println("Aparelho Telefonico:");        
        System.err.println("--------------------------------");
        //Aparelho Telefonico: ligar, atender, iniciarCorrerioVoz
        iphoneDoPedrinho.ligar();
        iphoneDoPedrinho.atender();
        iphoneDoPedrinho.iniciarCorrerioVoz();
        System.err.println("================================");

        System.err.println("Navegador na Internet:");        
        System.err.println("--------------------------------");
        //Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina
        iphoneDoPedrinho.exibirPagina();
        iphoneDoPedrinho.adicionarNovaAba();
        iphoneDoPedrinho.atualizarPagina();
        System.err.println("================================");        
        
    }
}
