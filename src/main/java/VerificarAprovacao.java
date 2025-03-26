public class VerificarAprovacao {
    private int nota;

    public VerificarAprovacao(int nota) {
        this.nota = nota;
    }

    public String verificarNota() {
        if (nota >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
