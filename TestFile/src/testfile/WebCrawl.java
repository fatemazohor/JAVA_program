/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joty_
 */
public class WebCrawl {

    public static void main(String[] args) throws IOException {

        try {
            URL url;
            url = new URL("https://en.wikipedia.org/wiki/Web_crawler");
            Scanner input = new Scanner(url.openStream());
            String matchT = "";
            String sourceT = "Web crawler";
            int j = 0;
            String next = "";
            while(j <= 10) {

                while (input.hasNext()) {
                    matchT = input.next();
                    if (matchT.matches(sourceT)) {
                        for (int i = 0; i < 10; i++) {
                            next += input.next() + " ";
                        }
                        System.out.println("LINE: " + next);
                        next = "";

                    } j++;

                }
                //can't figure how to stop file excution

               
            }
            File file = new File("web.text");
            PrintWriter output = new PrintWriter(file);
            System.out.println(file.exists());
            System.out.println(file);

        } catch (MalformedURLException ex) {
            Logger.getLogger(WebCrawl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
