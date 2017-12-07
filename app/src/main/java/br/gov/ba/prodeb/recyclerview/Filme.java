package br.gov.ba.prodeb.recyclerview;

/**
 * Created by artur.oliveira on 07/12/2017.
 */

public class Filme {

    public Filme(String titulo, String diretor, String produtor, String atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.produtor = produtor;
        this.atores = atores;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public String getAtores() {
        return atores;
    }

    private String titulo;
    private String diretor;
    private String produtor;
    private String atores;
}
