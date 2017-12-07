package br.gov.ba.prodeb.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Contract.View{


    private RecyclerView list_filmes;
    private TextView tv_empty;
    private ProgressBar progress_filme;
    private FilmeAdapter adapter;
    private Contract.ActionListener mUserActionsListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserActionsListener = new Presenter(this,this);
        iniciarViews();
    }


    /**
     * Iniciando a view
     */
    private void iniciarViews() {
        tv_empty = findViewById(R.id.tv_empty);
        progress_filme = findViewById(R.id.progress_filme);
        list_filmes = findViewById(R.id.recycler_list_filmes);
        list_filmes.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FilmeAdapter( new ArrayList<Filme>(),this, (Presenter)mUserActionsListener);
        list_filmes.setAdapter(adapter);
    }

    @Override
    public void showProgress(Boolean show) {
        if(show){
            this.progress_filme.setVisibility(View.VISIBLE);
        }else {
            this.progress_filme.setVisibility(View.GONE);
        }
    }
}
