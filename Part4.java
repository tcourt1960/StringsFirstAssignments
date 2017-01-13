
/**
 * Write a description of Part4 here.
 * 
 * @Tom Courtney
 * @Jan 11, 2017
 */

import edu.duke.*;
import java.io.File;

public class Part4 {

    public void processWebPage(){
    
     URLResource webPage = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html"); 
		for ( String word : webPage.words() ) {
		    //System.out.println(word);
		    String wLow = word.toLowerCase();
		    
			//if ( wLow.contains( "youtube.com" ) && ( wLow.contains( "https://" ) || wLow.contains( "http://" ) ) ) {
			    if ( wLow.contains( "youtube.com" ) ){
			    int startQuote = wLow.indexOf("\"");
			    int endQuote = wLow.lastIndexOf("\"");
			    String ytLink = word.substring( startQuote+1, endQuote );
			    System.out.println( ytLink );
       
            }
			
		}
        
    }

}
