import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JFrame;

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;


public class Creation extends JFrame {
    mxICell a,b;
    LinkedList<Edge>[] mygraph ;
    ArrayList< mxICell> nodelist= new ArrayList<>();
    public Creation(LinkedList<Edge>[] mygraph){
        this.mygraph=mygraph;

        boolean flaga=false;
        boolean flagb=false;

        LinkedList<Edge> list=null;
        final mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();
        graph.getModel().beginUpdate();

            for(int i=0 ; i<100 ; i++) {
                flaga=false;
                list = mygraph[i];
                for (int k = 0; k < nodelist.size() && list.size()!=0 ; k++) {

                       if (nodelist.get(k).getId().equals(list.get(0).source.name)) {
                           a = nodelist.get(k);
                           System.out.println("a1: " +a.getId());
                           flaga = true;
                       }
                }
                if (!flaga && list.size()!=0) {
                    a = (mxICell) graph.insertVertex(parent, list.get(0).source.name , list.get(0).source.name, 0, 0, 70, 30);
                    nodelist.add(a);
                    System.out.println("a2: " + a.getId());

                    flaga=true;
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 for (int j = 0; j<list.size(); j++) {
                     flagb=false;
                     System.out.println(nodelist.size());
                     for (int k = 0; k <nodelist.size(); k++) {
                             if (nodelist.get(k).getId().equals(list.get(j).destination.name)) {
                                 b = nodelist.get(k);
                                 flagb = true;
                                 System.out.println("b1: " + b.getId());
                             }

                     }
                     if (!flagb) {
                         b = (mxICell) graph.insertVertex(parent,list.get(j).destination.name, list.get(j).destination.name, 0, 0, 70, 30);
                         nodelist.add(b);
                         flagb=true;
                         System.out.println("b2: " + b.getId());
                     }
                    if( flaga && flagb ){
                        graph.insertEdge(parent, list.get(j).relation, list.get(j).relation, a, b);
                        System.out.println(list.get(j).relation);
                        graph.getModel().endUpdate();

                        mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
                        layout.execute(graph.getDefaultParent());
                        mxGraphComponent graphComponent = new mxGraphComponent(graph);
                        getContentPane().setLayout(new BorderLayout());
                        getContentPane().add(graphComponent, BorderLayout.CENTER);

                    }
                  }
            }
    }
}
