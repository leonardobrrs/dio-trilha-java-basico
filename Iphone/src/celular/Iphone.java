package celular;

import funcionalidades.multifuncional.EquipamentoMultiFuncional;

public class Iphone {
    public static void main(String[] args) {
        EquipamentoMultiFuncional iphone_8 = new EquipamentoMultiFuncional();

        iphone_8.tocar();
        iphone_8.pausar();
        iphone_8.selecionarMusica("Boulevard of Broken Dreams - Green Day");
        iphone_8.ligar("82999917714");
        iphone_8.atender();
        iphone_8.iniciarCorreioVoz();
        iphone_8.exibirPagina("instagram.com");
        iphone_8.adicionarNovaAba();
        iphone_8.atualizarPagina();
    }
}
