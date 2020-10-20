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
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //metodo
    // this é autoreferência, quem chamou o método status, sera substituido por this
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta "  + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    //metodo
    public void rabiscar() {
        if(this.tampada == true) {
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
