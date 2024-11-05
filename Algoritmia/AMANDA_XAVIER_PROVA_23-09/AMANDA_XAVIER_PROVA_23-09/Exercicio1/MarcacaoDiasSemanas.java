import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class MarcacaoDiasSemanas
{
    Random valorAleatorio = new Random();
    ArrayList<String> diasSemana =  new ArrayList();
    ArrayList<String> horas =  new ArrayList();
    Scanner scanUser = new Scanner(System.in);
    
    MarcacaoDiasSemanas()
    {
        System.out.println("Marcacao de dias e horários");
        
        System.out.println("Favor indique se deseja incluir sábado: ");
        
        String escritaUtilizador = scanUser.nextLine();
        
        diasEHoras();        
        
        if(escritaUtilizador.equalsIgnoreCase("sim"))
        {
            // Sortear os dias
            int indexQueSaiuNaSorte = valorAleatorio.nextInt(diasSemana.size());
            // Sortear as horas
            int indexQueSaiuNaSorteHoras = valorAleatorio.nextInt(horas.size());
            
            String diaSorteado = diasSemana.get(indexQueSaiuNaSorte);
            String horaSorteada = horas.get(indexQueSaiuNaSorteHoras);
            
            System.out.println("DIA SORTEADO: " + diaSorteado + " HORA SORTEADA: " + horaSorteada);
        } else 
        {
            String tirarSabado = diasSemana.get(5);
            System.out.println("RETIRADO O DIA " + tirarSabado);
            
            int indexQueSaiuNaSorte = valorAleatorio.nextInt(diasSemana.size());
            // Sortear as horas
            int indexQueSaiuNaSorteHoras = valorAleatorio.nextInt(horas.size());
            
            String diaSorteado = diasSemana.get(indexQueSaiuNaSorte);
            String horaSorteada = horas.get(indexQueSaiuNaSorteHoras);
            
            System.out.println("DIA SORTEADO: " + diaSorteado + " HORA SORTEADA: " + horaSorteada); 
        }        
    }
    
    void diasEHoras(){
        diasSemana.add("Segunda");
        diasSemana.add("Terça");
        diasSemana.add("Quarta");
        diasSemana.add("Quinta");
        diasSemana.add("Sexta");
        diasSemana.add("Sábado");
        horas.add("9:00");
        horas.add("10:00");
        horas.add("11:00");
        horas.add("14:00");
        horas.add("15:00");
        horas.add("16:00");
    }
    
}
