import java.util.ArrayList;
import java.util.LinkedList;
//ساخت گراف ما

public class Graph {
    int vertices;
    LinkedList<Edge>[] adjacencylist;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
        for (int i = 0; i < vertices ; i++) {
            adjacencylist[i] = new LinkedList<>();//هر خونه یک لیست است
        }
    }


    public LinkedList<Edge>[] addEgde(ArrayList<Edge> list) {

        for(Edge edge : list){
            adjacencylist[Integer.parseInt(edge.source.id)].addFirst(edge); //for directed graph
        }//به ابتدا اضافه میکنیم که پیچیدگی زمانی کمتر شود
       return adjacencylist ;
    }


    public void printGraph(){
        for (int i = 0; i <vertices ; i++) {
            LinkedList<Edge> list = adjacencylist[i];
            for (int j = 0; j <list.size() ; j++) {
                System.out.println(list.get(j).source.name +"  is connected to   " +
                        list.get(j).destination.name + " with weight " +  list.get(j).weight + "relation " + list.get(j).relation);
            }
        }
    }

}
