package br.gov.ba.prodeb.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import static com.google.gson.internal.$Gson$Preconditions.checkNotNull;

/**
 * Created by artur.oliveira on 07/12/2017.
 */

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.MyViewHolder> {

    private LayoutInflater mLayoutInflater;
    private List<Filme> mlista;
    private Context c;
    private FilmeOnClick categoriOnClick;

    public FilmeAdapter(List<Filme> mlista, Context c, FilmeOnClick categoriOnClick) {
        this.mlista = mlista;
        this.c = c;
        this.categoriOnClick = categoriOnClick;
        mLayoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addListaItem(Filme f, int position) {
        mlista.add(f);
        notifyItemInserted(position);
    }

    @Override
    public FilmeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.item_filme, parent, false);
        MyViewHolder mvh = new MyViewHolder(v , viewType);

        return mvh;
    }

    @Override
    public void onBindViewHolder(FilmeAdapter.MyViewHolder holder, int position) {
        Filme filme = mlista.get(position);

        holder.filme_titulo.setText(filme.getTitulo());
        holder.filme_produtor.setText(filme.getProdutor());
        holder.filme_diretor.setText(filme.getDiretor());
        holder.filme_produtor.setText(filme.getProdutor());
        holder.filme_atores.setText(filme.getAtores());
    }

    @Override
    public int getItemCount() {
        return mlista.size();
    }

    public Filme getItem(int position){
        return mlista.get(position);
    }

    public interface FilmeOnClick{
        void abrirListaFilme(Integer position);
    }

    public void replaceData(List<Filme> filmes) {
        setList(filmes);
        notifyDataSetChanged();
    }

    private void setList(List<Filme> filmes) {
        mlista = checkNotNull(filmes);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView filme_image;
        public TextView filme_titulo;
        public TextView filme_diretor;
        public TextView filme_produtor;
        public TextView filme_atores;
        public RelativeLayout ll_item;


        public MyViewHolder(View itemView, int viewType) {
            super(itemView);

            filme_atores = itemView.findViewById(R.id.item_atores);
            filme_image = itemView.findViewById(R.id.item_thumb);
            filme_diretor = itemView.findViewById(R.id.item_diretor);
            filme_produtor = itemView.findViewById(R.id.item_produtor);
            filme_titulo =  itemView.findViewById(R.id.item_titulo);
            ll_item = itemView.findViewById(R.id.ll_item);

        }
    }

}
