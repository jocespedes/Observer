package Observer;

public class Observer 
{
    public static void main(String[] args) 
    {
        // Instancia el objeto que será Observado
         UnObservado objObservado = new UnObservado();
                
        // Instanciar los observadores, pasándoles como parámetro el que será Observado
         new UnObservador( objObservado );        
         new UnObservador( objObservado );
         new UnObservador( objObservado );
         new UnObservador( objObservado );
         
         objObservado.setNumero(11);    
    }
}
