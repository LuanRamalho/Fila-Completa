import java.util.*;

/**
 *
 * @author Luan Ramalho
 */
public class FilaCompleta 
{

    /**
     * @param args the command line arguments
     */
    
    Stack <String> dado = new Stack <String> ();
    
    public void FormaFila()
    {
        System.out.println("ENFILEIRANDO: ");
        System.out.println(dado);
        dado.push("lesi583");
        System.out.println(dado);
        dado.push("cmxsk34");
        System.out.println(dado);
        dado.push("049483");
        System.out.println(dado);
        dado.push("58234747");
        System.out.println(dado);
        dado.push("cs!f.59238");
        System.out.println(dado);
        dado.push("skasoeunaj");
        System.out.println(dado);
        dado.push("sdfmbkg592");
        System.out.println(dado);
        dado.push("ç;as49");
        System.out.println(dado);
        dado.push("5*(5bc");
        System.out.println(dado);
    }
    
    public void Desenfila()
    {
        System.out.println("DESEMFILEIRANDO");
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
        dado.remove(0);
        System.out.println(dado);
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        FilaCompleta f = new FilaCompleta();
        f.FormaFila();
        System.out.println("");
        System.out.println("");
        f.Desenfila();
    }
    
}
