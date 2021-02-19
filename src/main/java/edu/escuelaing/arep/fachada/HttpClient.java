package edu.escuelaing.arep.fachada;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public class HttpClient {

    public static String getResponse(String route) throws UnirestException {
        HttpResponse<String> response = Unirest.get(route)
                .asString();
        return response.getBody();
    }


}
