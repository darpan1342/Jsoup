import java.util.*;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class html_parsing {
	public static void main(String []args) throws IOException {
		String url= "http://jsoup.org";
		Document document = Jsoup.connect(url).get();
		Elements ele = document.select("a[href]");
		for(Element link : ele )
		{
			System.out.println(link.attr("href")+" "+link.text());
		}
		
	}

}
