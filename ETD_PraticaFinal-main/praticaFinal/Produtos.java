package praticaFinal;

public class Produtos {

	    private int id;
	    private String titulo;
	    private String categoria_1;

	    public Produtos(){}
	    public Produtos(int id, String titulo, String categoria_1) {
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitle(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getCategoria_1() {
	        return categoria_1;
	    }

	    public void setCategoria_1(String categoria_1) {
	        this.categoria_1 = categoria_1;
	    }
}

