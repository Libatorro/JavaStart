package Teamt53_Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by Sebastian on 2016-07-11.
 */
public class PokeApiTEst {
    public static void main(String[] args) throws IOException {
        URL wykop = new URL("http://pokeapi.co/api/v2/pokemon/1/");

        URLConnection conn = wykop.openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");

        ;


        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));


        ArrayList<String> strings = new ArrayList<>();

        StringBuilder websiteSource = new StringBuilder();
        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            strings.add(tmp);

        }
        in.close();

        System.out.println(websiteSource.toString());


        Document doc = Jsoup.parse(websiteSource.toString());
        Elements elements = doc.select("div.lcontrast.m-reset-margin").select("h2");
        String absHref = doc.attr("abs:href");
        System.out.println(absHref);
        for (Element e : elements) {
            System.out.println(e.text());
        }


    }


}
