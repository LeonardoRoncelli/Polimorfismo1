package persona;
public class Persona {
        protected String nome;
        protected String indirizzo;
        public Persona(String nome, String indirizzo) {
            this.nome = nome;
            this.indirizzo = indirizzo;
        }
        public void visualizza() {
            System.out.println("Nome: " + nome + ", Indirizzo: " + indirizzo);
        }
        public String getIndirizzo() {
            return indirizzo;
        }
        public void setIndirizzo(String indirizzo) {
            this.indirizzo = indirizzo;
        }
    }