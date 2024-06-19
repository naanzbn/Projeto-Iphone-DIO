package Apps;
public class iphoneBase implements Musica, Telefone, Navegador{
    
    public void acessarInternet() {
        System.out.println("ACESSANDO INTERNET");
    }

    public void digitarEndereco() {
        System.out.println("DIGITANDO ENDEREÇO DE URL");
    }

    public void abrirNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void desligar() {
        System.out.println("DESLIGANDO");
    }

    public void discar() {
        System.out.println("DISCANDO");
    }

    public void iniciarMusica() {
        System.out.println("INICIANDO MUSICA");
    }

    public void pausarMusica() {
        System.out.println("PAUSANDO MUSICA");
    }

    public void trocarDeMusica() {
        System.out.println("TROCANDO DE MUSICA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
    
}
