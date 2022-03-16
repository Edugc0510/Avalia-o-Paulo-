package br.senai;
import br.senai.model.Evento;
import br.senai.model.Cliente;

public class Main {
    public static void main(String[] args) {

        Evento beiramar = new Evento();
        beiramar.setNome("Beiramar");
        beiramar.setData("28/07");
        beiramar.setClientes("Eduardo Gabriel Christmann Groscko","159.342.967-91","48 999778347","eduardo_groscko@estudante.sc.senai.br");
        beiramar.setClientes("Frederico Renan Monteiro","845.987.367-91","48 963517491","frederico_r_mottola@estudante.sc.senai.br");
        beiramar.setClientes("Pedro Daniel da Silva","684.147.584-87","48 927554693","pedro_dp_silva@estudante.sc.senai.br");
        beiramar.setClientes("Nicolas Noronha Jusi","247.364.587-98","48 926249885","nicolas_justi@estudante.sc.senai.br");
        beiramar.setClientes("Fulano","984.267.034-42","48 978175786","Fulano@gmail.com");
        beiramar.setClientes("Ciclano","971.319.354-84","48 999789583","Ciclano@gmail.com");
        System.out.println(beiramar);

        Evento costa = new Evento();
        costa.setNome("Costa da Lagoa");
        costa.setData("23/08");
        costa.setClientes("Eduardo Gabriel Christmann Groscko","159.342.967-91","48 999778347","eduardo_groscko@estudante.sc.senai.br");
        costa.setClientes("Frederico Renan Monteiro","845.987.367-91","48 963517491","frederico_r_mottola@estudante.sc.senai.br");
        costa.setClientes("Pedro Daniel da Silva","684.147.584-87","48 927554693","pedro_dp_silva@estudante.sc.senai.br");
        costa.setClientes("Nicolas Noronha Jusi","247.364.587-98","48 926249885","nicolas_justi@estudante.sc.senai.br");
        costa.setClientes("Fulano","984.267.034-42","48 978175786","Fulano@gmail.com");
        costa.setClientes("Ciclano","971.319.354-84","48 999789583","Ciclano@gmail.com");
        System.out.println(costa);

        Evento canas = new Evento();
        canas.setNome("Canasvieiras");
        canas.setData("13/02");
        canas.setClientes("Eduardo Gabriel Christmann Groscko","159.342.967-91","48 999778347","eduardo_groscko@estudante.sc.senai.br");
        canas.setClientes("Frederico Renan Monteiro","845.987.367-91","48 963517491","frederico_r_mottola@estudante.sc.senai.br");
        canas.setClientes("Pedro Daniel da Silva","684.147.584-87","48 927554693","pedro_dp_silva@estudante.sc.senai.br");
        canas.setClientes("Nicolas Noronha Jusi","247.364.587-98","48 926249885","nicolas_justi@estudante.sc.senai.br");
        canas.setClientes("Fulano","984.267.034-42","48 978175786","Fulano@gmail.com");
        canas.setClientes("Ciclano","971.319.354-84","48 999789583","Ciclano@gmail.com");
        System.out.println(canas);

    }
}

