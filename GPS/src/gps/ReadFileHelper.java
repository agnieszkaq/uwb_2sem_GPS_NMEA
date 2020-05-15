package gps;

import gps.nmea.NMEAParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ReadFileHelper {

    BufferedReader reader;

    void getLineByLine(String path) throws FileNotFoundException, IOException {

        reader = new BufferedReader(new FileReader(path));
        String line = reader.readLine();
        NMEAParser parser = new NMEAParser();
        while (line != null) {
            parser.parse(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
