import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nesbat{
    boolean flag = true;

    public List<String> find(ArrayList<String> listw, LinkedList<Edge>[] mygraph, String id) {

        Edge[] Queue = new Edge[50];//Queue
        int front = 0;
        int rear = -1;

        List<String> result = new ArrayList<>();
        LinkedList<Edge> list = mygraph[Integer.parseInt(id)];
 /*********************************************************************************************************************/

        //مادر بزرگ مادری و پدر بزرگ پدری (پدر پدر واقعی و مادر مادر واقعی )
        //دختر دختر و پسر پسر//نوه
        if (listw.size() == 2 && listw.get(0) == listw.get(1)) {
            for (int i = 0; i < list.size(); i++) {
                if (String.valueOf(list.get(i).weight).equals(listw.get(0))) {
                    rear++;
                    Queue[rear] = list.get(i);
                    System.out.println(Queue[rear].destination.name);
                }
            }
            while ((front-1)!=rear) {

                list = mygraph[Integer.parseInt(Queue[front].destination.id)];
                front++;
                for (int i = 0; i < list.size(); i++) {
                    if (String.valueOf(list.get(i).weight).equals(listw.get(1))) {
                        result.add(list.get(i).destination.name);
                        return result;

                    }
                }
            }
            return result;
        }
/******************************************************like BFS********************************************************/
        int j = 0;
        while (true) {
            for (int i = 0; i < list.size(); i++) {
                if (String.valueOf(list.get(i).weight).equals(listw.get(j))) {
                    rear++;
                    Queue[rear] = list.get(i);
                }
            }
            if(front-1 != rear) {
                if (String.valueOf(Queue[front].weight).equals(listw.get(listw.size() - 1))) {
                    while (front <= rear) {
                        result.add(Queue[front].destination.name);
                        front++;
                    }
                    return result;
                } else {
                    j = listw.indexOf(String.valueOf(Queue[front].weight));
                    list = mygraph[Integer.parseInt(Queue[front].destination.id)];
                    front++;
                    j++;
                }
            }
            else {
                return result;
            }
        }
/**********************************************************************************************************************/
        //        if(listw.size()==1){
//          for (int j = 0; j < list.size(); j++) {
//              System.out.println("weight" + listw.get(0));
//              System.out.println("weight" + list.get(j).weight);
//              if (listw.get(0).equals(String.valueOf(list.get(j).weight))) {
//                  top++;
//                    g[top] = (list.get(j));
//               }
//           }
//            while(top!=-1) {
//
//                result.add(g[top].destination.name);
//                top--;
//            }
//            return  result;
//        }
//
//        /************************************************************/
//        else {
//            int j = 0;
//            top =-1;
//            do {
//                for (int i = 0; i < list.size(); i++) {
//                    if (String.valueOf(list.get(i).weight).equals(listw.get(j))) {
//                        top++;
//                        g[top] = list.get(i);
//                        System.out.println(g[top].destination.name);
//                    }
//                }
//                if(top==-1){
//                    flag=false;
//                }
//                while (top != -1) {
//                    j = listw.indexOf(String.valueOf(g[top].weight));//0
//                    System.out.println("weight : " + g[top].weight );
//                    System.out.println("j1 : " + j);
//                    if (j == (listw.size()-1)) {//2
//                        System.out.println("1");
//                        result.add(g[top].destination.name);
//                        top--;
//                        if (top == -1) {
//                            flag = false;
//                            System.out.println("false");
//                        }
//                    }
//                    else {
//                        System.out.println("2");
//                        list = mygraph[Integer.parseInt(g[top].destination.id)];
//                        System.out.println(g[top].destination.name);
//                        top--;
//                        j++;
//                        System.out.println("j:" + j);
//                        break;
//                    }
//                }
//
//            } while (flag);
//        }
    }

}