package Server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class RPCServer {
    public static void main (String []args) throws XmlRpcException, IOException {
        System.out.println("Iniciando servidor...");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("Operations", MetoditosMich.class);
        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("Server running int http://localhost:1200");
        System.out.println("Funciona...");
    }
}
