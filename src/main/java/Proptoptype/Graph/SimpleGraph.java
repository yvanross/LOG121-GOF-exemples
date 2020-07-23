package Proptoptype.Graph;
import java.awt.*;
// import java.util.*;

/**
   A simple graph with round nodes and straight edges.
*/
public class SimpleGraph extends Graph
{
   /**
    *
    */
   private static final long serialVersionUID = 6440748636408730202L;

   public Node[] getNodePrototypes()
   {
      Node[] nodeTypes =
         {
            new CircleNode(Color.BLACK),
            new CircleNode(Color.WHITE)
         };
      return nodeTypes;
   }

   public Edge[] getEdgePrototypes()
   {
      Edge[] edgeTypes = 
         {
            new LineEdge()
         };
      return edgeTypes;
   }
}





