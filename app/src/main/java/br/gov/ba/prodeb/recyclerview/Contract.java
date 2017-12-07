package br.gov.ba.prodeb.recyclerview;

import java.util.List;

/**
 * Created by artur.oliveira on 07/12/2017.
 */

public interface Contract {

    interface View{
        void showProgress(Boolean show);
        void showFilmes(List<Filme> filmesList);
    }

    interface ActionListener{

        void carregarFilmes();

    }
}
