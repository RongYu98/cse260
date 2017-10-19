import java.util.ArrayList;
import java.util.List;

public class Album{

    public String name;

    public List<Track> tracks = new ArrayList<>();

    public Album( String name ){
	this.name = name;

    }

    public void randomSongs(){
	String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	for ( int i=0; i<4; i++ ){
	    int rating = (int)( Math.random()*5 );
	    int place = (int)( Math.random()*26 );
	    String name = letters.substring( place, place+1 );
	    Track idk = new Track( rating, name );
	    tracks.add( idk );
	}
    }

    public String toString(){
	return name;
    }
    public List<Track> getTracks(){
	return tracks;
    }

}
