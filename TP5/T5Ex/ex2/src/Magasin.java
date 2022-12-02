import java.util.Enumeration;
import java.util.Vector;

public class Magasin {
    public Article Article ;
    private Vector <Article> articles ;
    public Magasin(){
        articles = new  Vector <> ();
    }
    public void add(Article A){

        articles.addElement(A);

    }
    public boolean contains(Article A ){
        if( articles.contains(A))
            return true;
        else
            return false;

    }
    public void delete(Article A){
        for (int i=0 ; i<articles.size(); i++){
            if(articles.get(i) == A){
                articles.removeElementAt(i);
            }
        }
    }
    public void tousLesArticles() {
        Enumeration en = articles.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
    public void tousLesArticles2(){
        for(int i = 0; i < articles.size(); i++){
            System.out.println(articles.get(i).getCode() + articles.get(i).getNom());

        }
    }
}
