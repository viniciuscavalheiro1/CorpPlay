package entidades;

public class Venda {

    private int id;
    private String data;
    private String vendas;

    public Venda(int id, String data, String vendas) {
        this.data = data;
        this.id = id;
        this.vendas = vendas;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the vendas
     */
    public String getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(String vendas) {
        this.vendas = vendas;
    }
}
