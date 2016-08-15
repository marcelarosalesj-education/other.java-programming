/*
    Query a database with Laws.

*/
import java.util.*;

public class ArticlesHandler {

    public static void main(String[] args) {

        Law firstLaw = new Law("The Law A",
        	"This is a set of rules that apply in A country.");
		Law secondLaw = new Law("The Law BCD",
            "This is a set of rules that apply in B, C and D.");

        // Bulding firstLaw
        Article art1 = new Article(1, "About Human Rights", "21-07-2016");
        Article art2 = new Article(2, "About Land Distribution", "22-07-2016");
		Article art3 = new Article(3, "About Social Rights", "23-07-2016");
        Article ref1 = new Article(1, "Reform 1 about Land", "24-07-2016");
        Article ref2 = new Article(2, "Reform 2 about Land", "25-07-2016");
        art2.addReform(ref1);
        art2.addReform(ref2);        
        firstLaw.addArticle(art1);
        firstLaw.addArticle(art2);
        firstLaw.addArticle(art3);

        // Bulding secondLaw
        Article art21 = new Article(1, "About HR", "01-08-2016");
        Article art22 = new Article(2, "About LD", "02-08-2016");
        Article ref21 = new Article(1, "Ref 1", "03-08-2016");
        art21.addReform(ref21);
        secondLaw.addArticle(art21);        
        secondLaw.addArticle(art22);
        
        System.out.println();
        firstLaw.printLaw();
        System.out.println();
        secondLaw.printLaw();
        System.out.println();

        firstLaw.printArticle(1);
        firstLaw.printArticle(2);
        firstLaw.printArticle(3);

        System.out.println();

        secondLaw.printArticle(1);
        secondLaw.printArticle(2);


    }
}