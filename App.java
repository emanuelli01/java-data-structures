import java.util.*;

public class App{
    public static void main(String []args){

        Garagem garagem = new Garagem();
        Carros civic= new Carros("ITB9865", "cinza","Civic", 195);


        garagem.adicionarCarro(civic);
        garagem.listarCarros();

    }

}