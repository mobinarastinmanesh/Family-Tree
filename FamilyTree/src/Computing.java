import java.util.LinkedList;

public class Computing {
    LinkedList<Edge>[] mygraph ;

    public  Computing(LinkedList<Edge>[] mygraph){
        this.mygraph = mygraph ;
    }

    public int max(String id){
        LinkedList<Edge> list = mygraph[Integer.parseInt(id)];
        int cnt=0;
        int x=0;

        for(int i=0 ; i< list.size() ;i++){
            if( String.valueOf(list.get(i).weight).equals("3") || String.valueOf(list.get(i).weight).equals("4")){
                cnt++;

                x += max(list.get(i).destination.id);
            }
        }
        x = x+cnt ;

        return  x ;
    }

}
