package persona;
public class Professore extends Persona {
    private String codiceDocente;
    private String dipartimento;
    public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
        super(nome, indirizzo);
        this.codiceDocente = codiceDocente;
        this.dipartimento = dipartimento;
    }
    public void visualizza() {
        System.out.println("persona.Professore - Nome: " + nome + ", Indirizzo: " + indirizzo + ", Codice Docente: " + codiceDocente + ", Dipartimento: " + dipartimento);
    }
    public String getCodiceDocente() {
        return codiceDocente;
    }
    public void setCodiceDocente(String codiceDocente) {
        this.codiceDocente = codiceDocente;
    }
    public String getDipartimento() {
        return dipartimento;
    }
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
}