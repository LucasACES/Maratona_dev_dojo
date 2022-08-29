package academy.devdojo.maratonajava.introducao;
/*
* Pratica
* Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <name> morando no endereço <endereço>,
* confirmo que recebi o salário de <salario>, na data <data>.
 */

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Lucas";
        String endereco = "São José dos Campos";
        Double salario = 1798.00;
        String dataRecebimento = "26/08/2022";

        System.out.println("Eu "+ nome +" morando no endereço " + endereco + ", " +
                "confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento + ".");
    }
}
