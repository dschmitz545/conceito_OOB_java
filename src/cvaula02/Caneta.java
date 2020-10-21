package cvaula02;

/**
 *
 * @author diego
 */
//(Molde)Classe - tem todos os atributos e todos os métodos
public class Caneta {

    //atributos
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    //Construtor ex:01
    public Caneta(String m, String c, double p, int ca, boolean t) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = ca;
        this.tampada = t;
    }

    //Construtor ex:02
    //public Caneta() {
    //    this.modelo = "";
    //    this.cor = "";
    //    this.ponta = 0;
    //    this.carga = 0;
    //    this.tampada = false;
    //}
    
    //métodos assesores
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    //Construtor ex:03
    //public Caneta() {
    //    this.setModelo("Diego");
    //    this.setCor("");
    //    this.setPonta(0);
    //    this.setCarga(0);
    //    this.setTampada(false);
    //}
    
    //Construtor ex:04
    //public Caneta(String n, String c, double p, int ca, boolean t) {
    //    this.setModelo("Carol");
    //    this.setCor("Amarela");
    //    this.setPonta(0.8);
    //    this.setCarga(85);
    //    this.setTampada(false);
    //}

    //metodo
    // this é autoreferência, quem chamou o método status, sera substituido por this
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    //metodo
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    //metodo
    // this é nome do objeto que chamou o método tampada, nesse exemplo o c1.
    protected void tampar() {
        this.tampada = true;
    }

    //metodo
    protected void destampar() {
        this.tampada = false;
    }

}
