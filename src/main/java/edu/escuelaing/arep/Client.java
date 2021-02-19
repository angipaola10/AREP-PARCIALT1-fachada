package edu.escuelaing.arep;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.escuelaing.arep.fachada.HttpClient;

public class Client {

    public static void main( String[] args ) throws UnirestException {
        System.out.println("Dyno 1: Servicio Fachada\n");

        System.out.println("URL: https://parcialarep1-fachada.herokuapp.com/fachada?value=90&operation=sin");
        System.out.println("Response: "+ HttpClient.getResponse("https://parcialarep1-fachada.herokuapp.com/fachada?value=90&operation=sin")+"\n");

        System.out.println("URL: https://parcialarep1-fachada.herokuapp.com/fachada?value=1234&operation=cos");
        System.out.println("Response: "+ HttpClient.getResponse("https://parcialarep1-fachada.herokuapp.com/fachada?value=90&operation=cos")+"\n");

        System.out.println("URL: https://parcialarep1-fachada.herokuapp.com/fachada?value=1234&operation=tan");
        System.out.println("Response: "+ HttpClient.getResponse("https://parcialarep1-fachada.herokuapp.com/fachada?value=45&operation=tan")+"\n");

        System.out.println("URL: https://parcialarep1-fachada.herokuapp.com/fachada?value=567&operation=sin");
        System.out.println("Response: "+ HttpClient.getResponse("https://parcialarep1-fachada.herokuapp.com/fachada?value=45&operation=sin")+"\n");

        System.out.println("URL: https://parcialarep1-fachada.herokuapp.com/fachada?value=1234&operation=cos");
        System.out.println("Response: "+ HttpClient.getResponse("https://parcialarep1-fachada.herokuapp.com/fachada?value=45&operation=cos")+"\n");

        System.out.println("URL: https://parcialarep1-fachada.herokuapp.com/fachada?value=1234&operation=tan");
        System.out.println("Response: "+ HttpClient.getResponse("https://parcialarep1-fachada.herokuapp.com/fachada?value=45&operation=tan")+"\n");;
    }

}
