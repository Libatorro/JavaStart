package Teamt53_Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Sebastian on 2016-05-16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL wykop = new URL("http://wykop.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(wykop.openStream(), "UTF-8"));

        StringBuilder websiteSource = new StringBuilder();
        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            websiteSource.append(tmp);
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
