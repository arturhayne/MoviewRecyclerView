package br.gov.ba.prodeb.recyclerview;

import android.content.Context;
import android.os.Handler;

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
    }

    @Override
    public void abrirListaFilme(Integer position) {

    }
}
