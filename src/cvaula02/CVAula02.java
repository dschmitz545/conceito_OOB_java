package cvaula02;

/**
 *
 * @author diego
 */

//Classe Principal com o método principal que é o Main
public class CVAula02 {
    
   public static void main(String[] args) {
       // Criando um novo objeto c1 do tipo Caneta, atravez da classe Caneta
        Caneta c1 = new Caneta();
        
        //definindo valor dos atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        //chamando método
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        //Estanciando uma segunda caneta
        Caneta c2 = new Caneta();
        
        //definindo valor dos atributos
        c2.modelo = "Diego";
        c2.cor = "Vermelha";
        
        //chamando os métodos
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
