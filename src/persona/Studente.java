package persona;
public class Studente extends Persona {
        private int matricola;
        private int anno;
        private int ultimaMatricola;
        public Studente(String nome, String indirizzo, int matricola, int anno, int ultimaMatricola) {
            super(nome, indirizzo);
            this.matricola = matricola;
            this.anno = anno;
            this.ultimaMatricola = ultimaMatricola;
        }
        public void visualizza() {
            System.out.println("persona.Studente - Nome: " + nome + ", Indirizzo: " + indirizzo + ", Matricola: " + matricola + ", Anno: " + anno + ", Ultima Matricola: " + ultimaMatricola);
        }
        public int getMatricola() {
            return matricola;
        }
        public void setMatricola(int matricola) {
            this.matricola = matricola;
        }
        public int getAnno() {
            return anno;
        }
        public void setAnno(int anno) {
            this.anno = anno;
        }
        public int getUltimaMatricola() {
            return ultimaMatricola;
        }
        public void setUltimaMatricola(int ultimaMatricola) {
            this.ultimaMatricola = ultimaMatricola;
        }
    }