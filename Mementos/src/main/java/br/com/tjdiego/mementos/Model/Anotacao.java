
package br.com.tjdiego.epistemicapp.Model;

import java.sql.Date;

/**
 *
 * @author Diego
 */
public class Anotacao {
    
    //Atributos
    private int id;
    private Date data;
    private String texto;

    //Gerters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //Construtores
    public Anotacao() {
    }

    public Anotacao(int id, Date data, String texto) {
        this.id = id;
        this.data = data;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Anotacao{" + "id=" + id + ", data=" + data + '}';
    }
    
    
    
}
