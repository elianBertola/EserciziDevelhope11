public class CharUnicode {
    private String testo;
    private int posizione;

    public CharUnicode(String testo, int posizione) {
        this.testo = testo;
        this.posizione = posizione;
    }

    public String prendeUnicode() {
        StringBuilder risultato = new StringBuilder();
        if (posizione >= 0 && posizione < testo.length()) {
            char carattere = testo.charAt(posizione);
            risultato.append("Il carattere nella posizione " + posizione + " e: " + carattere);
        } else {
            risultato.append("Errore, stringha troppo corta");
        }
        return risultato.toString();
    }
}
