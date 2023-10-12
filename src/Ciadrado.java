public class Ciadrado {
    private double lado1,lado2;

    public Ciadrado(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
  
    float obtenerArea(){
       float area= getLado1()*getLado2();
       return area;
    }
}
