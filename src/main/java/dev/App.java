package dev;
import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String asciiArt = FigletFont.convertOneLine( "App" );
    	System.out.println(asciiArt);
    }
}
