package Genericas;

public class Caixa<T>  {
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void guardar(T valor){
        this.conteudo =valor;
    }

    public T pegar() {
        return conteudo;
    }

}
