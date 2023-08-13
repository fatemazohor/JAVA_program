package testfile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

            while (input.hasNext()) {
                matchT = input.next();
                if (matchT.matches(sourceT)) {
                    for (int i = 0; i < 10; i++) {
                        next += input.next() + " ";
                    }
                    //ignore this 2 line
//                        count++;
//                        System.out.println("LINE: " + next);
                    next = "";

                }

            }
            //can't figure how to stop file excution

//            }
            File file = new File("web.text");
            PrintWriter output = new PrintWriter(file);
            output.print(next);
            output.close();
            System.out.println(file.exists());
            System.out.println(file);

        } catch (MalformedURLException ex) {
            Logger.getLogger(WebCrawl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
