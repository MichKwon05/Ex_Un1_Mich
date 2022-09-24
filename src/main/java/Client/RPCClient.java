package Client;

import Server.MetoditosMich;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    BeanPerson persona = new BeanPerson();
    public static void main(String[] args) throws MalformedURLException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner read = new Scanner(System.in);
        MetoditosMich mth = new MetoditosMich();
        int opc;

       System.out.println("++++++REGISTRO DE DATOS++++");
       do{
           mth.registro();
           System.out.println("");
           mth.datos();
           System.out.println("");
           mth.resulCurp();

           System.out.println("Deseas continuar? \n1.Si \n0.No");
           opc = read.nextInt();
       }while(opc !=0);

        System.out.println("Fin");

         /*System.out.print("Indica tu nombre");

        System.out.print("Indica tu primer apellido");

        System.out.print("Indica tu segundo apellido");

        System.out.print("Sexo (Hombre o mujer)");

        System.out.println("Indica tu estado");

        System.out.print("Indica tu fecha de nacimiento");

        System.out.println();*/

    }
}
