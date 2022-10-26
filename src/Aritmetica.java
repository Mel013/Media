public class Aritmetica implements ICalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String situacao(double media) {
        if (media > 5) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}