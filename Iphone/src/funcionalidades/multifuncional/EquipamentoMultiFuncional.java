package funcionalidades.multifuncional;

import funcionalidades.navegador.NavegadorInternet;
import funcionalidades.reprodutor.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;

public class EquipamentoMultiFuncional implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public void exibirPagina(String url){
        System.out.println("Acessando página: "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
    public void tocar(){
        System.out.println("Tocando música...");
    }
    public void pausar(){
        System.out.println("Música pausada...");
    }
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica + "...");
    }
    public void ligar(String numero){
        System.out.println("Ligando para o número " + numero + "...");
    }
    public void atender(){
        System.out.println("Atendendo ligação...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo correio de voz...");
    }
}
