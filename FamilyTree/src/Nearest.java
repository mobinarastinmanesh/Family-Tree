import java.util.*;

public class Nearest {

    String namesource;
    int idsource;
    int iddestination;
    String namedestination;
    LinkedList<Edge>[] mygraph;
    static ArrayList<Edge> nesbat;
    static  ArrayList<Edge> pathList = new ArrayList<>();

   /** int[][] weight = new int[100][100];
    String[][] path = new String[100][100];**/ //for warshal

    public Nearest(LinkedList<Edge>[] mygraph, String id1, String id2, String name1, String name2 , ArrayList<Edge> nesbat) {
        this.mygraph = mygraph;
        this.namesource = name1;
        this.namedestination = name2;
        this.idsource = Integer.parseInt(id1);
        this.iddestination = Integer.parseInt(id2);
        this.nesbat =nesbat ;
    }

/***********************************************DFS********************************************************************/

    public ArrayList<Edge> printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[100];
        printAllPathsUtil(s, d, isVisited, pathList);
        return  nesbat ;
    }

    private void printAllPathsUtil(Integer u, Integer d, boolean[] isVisited,ArrayList<Edge> localPathList) {



        isVisited[u] = true;

        if (u.equals(d)) {
            System.out.println("size :" + localPathList.size());
            Edge edge = new Edge();
            edge.relation=" ";
            for(int i=localPathList.size()-1 ;i>=0 ;i--){//یک مسیر ز مبدا تا مقصد
                edge.relation += localPathList.get(i).relation;//کلمات به هم اضافه میشوند
                System.out.println(localPathList.get(i).relation);
                edge.relation += " " ;//یه فاصله بین کلمات
                edge.weight+= localPathList.get(i).weight;//وزن ها جمع میشود
                System.out.println(localPathList.get(i).weight);
            }
            edge.relation += "\n" ;
            nesbat.add(edge);
            isVisited[u] = false;
            return;
        }


        for (Edge i : mygraph[u]) {
            if (!isVisited[Integer.parseInt(i.destination.id)]) {//اگر ویزیت نشده بود
                Edge edge =new Edge(i.weight , i.relation);
                localPathList.add(edge);
                printAllPathsUtil(Integer.parseInt(i.destination.id), d, isVisited, localPathList );


                localPathList.remove(edge);
            }
        }


        isVisited[u] = false;
    }


/********************************************************varshal(kamel)*************************************************/
//        for (int i = 0; i <100 ; i++) {//پيشفرض
//            for (int j = 0; j <100 ; j++) {
//                weight[i][j]=999;
//                path[i][j]="-";
//            }
//        }
//        for (int i = 0; i <100 ; i++) {//پيشفرض
//            weight[i][i]=0;
//        }
//
//        for (int i = 0; i <100 ; i++) {//ماتريس مجاورت اوليه
//            LinkedList<Edge> list =mygraph[i];
//            for (int j = 0; j <list.size() ; j++) {
//                weight[i][Integer.parseInt(list.get(j).destination.id)]=list.get(j).weight;
//                path[i][Integer.parseInt(list.get(j).destination.id)]= String.valueOf(i);
//             }
//        }
//            for (int k = 0; k < 100; k++) {
//                 for (int i = 0; i < 100; i++) {
//                      for (int j = 0; j < 100; j++) {
//                          if (weight[i][k] + weight[k][j] < weight[i][j]){
//                              weight[i][j] = weight[i][k] + weight[k][j];
//                              path[i][j] = path[k][j];
//                          }
//                      }
//                 }
//            }
//    }
//    List<Integer> list = new ArrayList <> ();
//    String middle;
//
//    public List<Integer> search() {
//      if(  weight[idsource][iddestination] <=8  && path[idsource][iddestination].equals(String.valueOf(idsource))){//نسبت مستقيم
//          list.add(weight[idsource][iddestination]);
//          System.out.println("مستقیم");
//          return list;
//      }
//      else {
//          do{
//              System.out.println("path" + path[idsource][iddestination]);
//              middle=path[idsource][iddestination];
//              System.out.println("middle" + middle);
//              list.add(weight[Integer.parseInt(middle)][iddestination]);
//              System.out.println("weight " + weight[Integer.parseInt(middle)][iddestination]);
//              iddestination= Integer.parseInt(middle);
//
//          }while (!path[idsource][iddestination].equals(String.valueOf(idsource)));
//          System.out.println("weight " + weight[idsource][iddestination]);
//
//          list.add(weight[idsource][iddestination]);
//
//          System.out.println("غیر مستقیم");
//          return list;
//      }
//    }
/****************************************************************************************************************************/
}
