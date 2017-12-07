package br.gov.ba.prodeb.recyclerview;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static android.os.Looper.getMainLooper;

/**
 * Created by artur.oliveira on 07/12/2017.
 */

public class Presenter implements Contract.ActionListener, FilmeAdapter.FilmeOnClick {

    private Context contexto;
    private Contract.View filmeView;
    private List<Filme> filmeList;
    private Handler mHandler = new Handler(getMainLooper());

    public Presenter(Context contexto, Contract.View filmeView) {
        this.contexto = contexto;
        this.filmeView = filmeView;
        filmeList = new ArrayList<>();
    }

    @Override
    public void abrirListaFilme(Integer position) {

    }

    @Override
    public void carregarFilmes() {

        try {
            Filme filme1 = new Filme("Senhor dos Aneis", "Irmaoswalkonski", "Peter Jackson", "Frodo");
            Filme filme2 = new Filme("Senhor dos Aneis2", "Irmaoswalkonski2", "Peter Jackson2", "Frodo2");

            filmeList.add(filme1);
            filmeList.add(filme2);

            filmeView.showFilmes(filmeList);

        }catch(Exception e){

          Log.d("Debug",e.getMessage());

        }
    }
}
