import Apps.iphoneBase;
import Apps.validarRede;

public class iphonePronto{
    public static void main(String[] args) {
        
    validarRede vRede = new validarRede();
    vRede.validandoRede();

    iphoneBase app = null;
    String appEscolhido = "Musica";


    if(appEscolhido.equals("Musica"))
        app = new iphoneBase();
    else if (appEscolhido.equals("Telefone"))
        app = new iphoneBase();
    else if (appEscolhido.equals("Navegador"))
        app = new iphoneBase();

    /*app.abrirNovaAba();
    app.digitarEndereco();
    app.acessarInternet();

    app.atender();
    app.desligar();
    app.discar(); */

    app.iniciarMusica();
    app.pausarMusica();
    app.selecionarMusica();
    app.trocarDeMusica();
    }
}
