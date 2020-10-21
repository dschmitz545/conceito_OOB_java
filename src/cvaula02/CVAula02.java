package cvaula02;

/**
 *
 * @author diego
 */
//Classe Principal com o método principal que é o Main
public class CVAula02 {

    public static void main(String[] args) {
        // Criando um novo objeto c1 do tipo Caneta, atravez da classe Caneta

        //Construtor com ex:01
        Caneta c1 = new Caneta("Stabilo", "Verde", 0.8, 70, false);

        //Construtor com ex: 02
        //Caneta c1 = new Caneta();

        //Construtor com ex: 03
        //Caneta c1 = new Caneta();

        //Construtor com ex:04
        //Caneta c1 = new Caneta("","",0,0,false);

        //definindo valor dos atributos
        ///c1.modelo = "Compactor";
        //c1.cor = "Vermelho";
        //c1.ponta = 0.5f;
        //c1.carga = 80;
        //c1.tampada = true;
        //chamando método
        c1.status();

    }
}
