import java.util.ArrayList;

public class Article {
	
	public int number;
	public String content;
	public String date;
	public int length;
	ArrayList<Article> reforms = new ArrayList<Article>(); 

	public Article(int n, String c, String d){
		number = n;
		content = c;
		date = d;
		length = 0;
	}

	public int addReform(Article ref){
		reforms.add(ref);
		length++;
		return 0;
	}




}