import java.util.ArrayList;

public class Law {
	
	public String name;
	public String description;
	public int length;
	ArrayList<Article> articles = new ArrayList<Article>(); 

	
	public Law(String n, String desc){
		name = n;
		description = desc;
		length = 0;
	}

	public int addArticle(Article art){
		articles.add(art);
		length++;
		return 0;
	}

	public int printLaw(){
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Num. of Articles: " + length);
		for(int i=0; i<length; i++){
			System.out.print("  Art. " + (i+1) + " ");
			System.out.println(articles.get(i).content) ;
		}
		return 0;
	}

	public int printArticle(int num){
		for(int i=0; i<length; i++){
			if( num == articles.get(i).number){
				System.out.println("Art. " + (i+1) );
				System.out.println("  [" + articles.get(i).date + "]");
				System.out.println("  " + articles.get(i).content);
				
				for(int j=0; j<articles.get(i).length; j++){
					System.out.println("  " + articles.get(i).reforms.get(j).content);	
				}
				


			}
		}
		return 0;
	}


}