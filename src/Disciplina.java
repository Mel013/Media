public class Disciplina {
    double media;
    private String nome;
   private double p1, p2;
    String situacao;
   private ICalcMedia CalMedia;

   Disciplina (ICalcMedia calq){
       this.CalMedia = calq;
   }
    void CalculaMedia (){
        media = CalMedia.CalculaMedia(p1,p2);
        situacao = CalMedia.situacao(media);

    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ICalcMedia getCalMedia() {
        return CalMedia;
    }

    public void setCalMedia(ICalcMedia calMedia) {
        CalMedia = calMedia;
    }


}
