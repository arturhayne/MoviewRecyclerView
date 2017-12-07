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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    private String titulo;
    private String diretor;
    private String produtor;
    private String atores;
}
