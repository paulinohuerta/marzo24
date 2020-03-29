import java.net.URL;
import java.io.InputStreamReader;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class parserRome {
	public static void main(String[] args) {
		boolean ok = false;

		try {
			URL feedURL = new URL("https://www.lavanguardia.com/mvc/feed/rss/home");

			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed = input.build(new XmlReader(feedURL));

			System.out.println(feed.getTitle());
			System.out.println(feed.getEntries());


			ok = true;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("ERROR: " + ex.getMessage());
		}

		if (!ok) {
			System.out.println();
			System.out.println("FeedReader reads and prints any RSS/Atom feed type,");
			System.out.println("The first parameter must be the URL of the feed to read,");
			System.out.println();
		}

	}
}
