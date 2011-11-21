package it.polimi.selfletclipse.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Nicola
 */
public class StringUtils {

    public static String inputStreamToString(InputStream is) {

	if (is == null)
	    return new String();

	BufferedReader reader = new BufferedReader(new InputStreamReader(is));

	StringBuilder sb = new StringBuilder();
	String line = null;
	try {
	    while ((line = reader.readLine()) != null) {
		sb.append(line + "\n");
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    try {
		is.close();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}

	return sb.toString();
    }
}
