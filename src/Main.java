public class Main {
    public static void main(String[] args) {

        ICalcMedia calculo = new Aritmetica();
        // Geometrica calculo = new Geometrica();

        Disciplina d = new Disciplina(calculo);

        d.setNome("Padroes de desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalculaMedia();
        System.out.print(
                String.format( "p1:%.2f p2:%.2f media:%.2f situacao: %s",
                        d.getP1(),d.getP2(), d.getMedia(), d.getSituacao()));
    }
}