package utilitario;

import java.io.IOException;
import java.util.jar.Attributes.Name;

public class ProgressBar {

    String name = "cristian.paccha@epn.edu.ec";
    public static void showProgressBar_i (String name, char c) throws IOException, InterruptedException
    {
        int TamBar = 26;
        String sb= new String();
        for (int porcentaje = 0; porcentaje <= 100; porcentaje=porcentaje+4)
        {

        int nroCaracteres = porcentaje * TamBar / 100;  //numero de caracteres
        sb =  "\r [";
        for (int k = 0; k <= name.length(); k++)
            sb += String.format("%s", ((nroCaracteres < k) ? " " : c));
            sb += "]";
        
        System.out.print("\n");
        System.out.write(sb.getBytes());
        System.out.printf(" %d %%", porcentaje);
        for (int n = 0; n < 26; n++){
            char g = name.charAt(n);
            System.out.print(g);
            //System.out.printf("Loading: " + n + " de 25");
        }
        Thread.sleep(100);
    }
    }
}
