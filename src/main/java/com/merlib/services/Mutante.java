package com.merlib.services;

import com.merlib.models.Respuesta;
import com.merlib.process.Mutant;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("mutant")
public class Mutante {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validarMutante(String req){


        /*  convertir json en array */
        JSONObject obj = new JSONObject(req);
        JSONArray array = obj.getJSONArray("dna");
        int largo = array.length();
        String[] arr = new String[largo];
        for(int i = 0 ; i < largo ; i++){
            arr[i]  =  array.getString(i);
            System.out.println("VAL: " + arr[i]);
        }

        boolean isMutant = Mutant.isMutant(arr);
        Respuesta resp = new Respuesta(isMutant);
        if (isMutant){
            return Response.ok(resp).build();
        }else{
            return Response.status(Response.Status.FORBIDDEN).entity(resp).build();
        }
    }
}
