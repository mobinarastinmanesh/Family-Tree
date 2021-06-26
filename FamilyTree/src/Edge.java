//شی برای گراف وزن دار
//یال ها که در واقع نسبت بین دو شخص هستند
public class Edge {
    public Edge(int weight, String relation) {
        this.weight = weight;
        this.relation = relation;
    }
   public Edge(){}
    Person source;
    Person destination;
    int weight;
    String relation;

}
