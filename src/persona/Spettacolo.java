package persona;
public class Spettacolo {
    private String titolo;
    private String nomeCompagnia;
    private String data;
    private String orario;
    private static final double costo=15;
    private static final int postiDisponibili=100;
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    public String getTitolo(){
        return titolo;
    }
    public void setNomeCompagnia(String nomeCompagnia){
        this.nomeCompagnia=nomeCompagnia;
    }
    public String getNomeCompagnia(){
        return nomeCompagnia;
    }
    public void setData(String data){
        this.data=data;
    }
    public String getData(){
        return data;
    }
    public void setOrario(String orario){
        this.orario=orario;
    }
    public String getOrario(){
        return orario;
    }
}