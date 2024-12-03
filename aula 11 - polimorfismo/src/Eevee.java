public class Eevee {
    private String tipo;
    private int altura, hp;
    private double peso;

    public String ataque(){
        return "Ataque-rápido";
    }
    public String defesa(){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
