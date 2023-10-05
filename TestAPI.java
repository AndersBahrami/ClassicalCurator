/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classicalcurator;

import com.google.gson.Gson;
import java.net.URLEncoder;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.lang.model.element.Element;
import javax.swing.text.Document;
import org.jsoup.Jsoup;

/**
 *
 * @author andersbahrami
 */
public class TestAPI {
    
    
    
    public static void main(String[] args) throws Exception {
   // public TestAPI() throws URISyntaxException, IOException, InterruptedException{
        //Make Http GET Request for OpenOpus Data
        /*String endpoint = "/composer/list/pop.json";
        String zed = "[{\"composer\":\"Igor Stravinsky\",\"title\":\"Le sacre du printemps\"},{\"composer\":\"Anton Bruckner\",\"title\":\"Symphony no 4\"},{\"composer\":\"Ferruccio Busoni\", \"title\":\"Piano concerto, op. 39\"}]";
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://dynapi.openopus.org/dyn/work/guess?works=" + URLEncoder.encode(zed, StandardCharsets.UTF_8)))//"https://api.openopus.org" + endpoint))
                .GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
        
        Gson gson = new Gson();
        
        MusicalInformation getInfo = new MusicalInformation();
        //getInfo = gson.fromJson(getResponse.body(), MusicalInformation.class);
        
        //System.out.println(getResponse.body());
        
        
        
        
        
        
        //Attempt to make a POST Request
        endpoint = "/dyn/work/random/";
        String key = "popularwork";
        String value = "1";
        //String q = "%5B%7B\"composer\":\"Ludwig%20van%20Beethoven\",\"title\":\"Piano%20concerto%20no.5\"%7D%5D";
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI(("https://dynapi.openopus.org/dyn/work/guess/?works=" +
                URLEncoder.encode(zed, StandardCharsets.UTF_8)))) //https://dynapi.openopus.org" + endpoint + "?" + key + "=" + value))
                .POST(BodyPublishers.ofString("")).build();
        //System.out.println(URLEncoder.encode(q, StandardCharsets.UTF_8));
        
        HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
        MusicalInformation postInfo = new MusicalInformation();
        System.out.println(URLEncoder.encode(zed, StandardCharsets.UTF_8));
        System.out.println(postResponse.body());
        //postInfo = gson.fromJson(postResponse.body(), MusicalInformation.class);
        /*org.jsoup.nodes.Document doc = Jsoup.parse(postResponse.body());
        org.jsoup.nodes.Element link = doc.select("a").first();
        String newLocation = link.attr("href");
        
        HttpRequest getRequest2 = HttpRequest.newBuilder()
                .uri(new URI(newLocation))
                .GET().build();
        HttpResponse<String> getResponse2 = httpClient.send(getRequest2, BodyHandlers.ofString());
        */
        
        //System.out.println((getInfo.getWorks()).get(1).getTitle());*/
        
        
        PieceHeap pieceHeap = new PieceHeap();
        Piece piece = new Piece();
        pieceHeap.add(piece);
    }
}
