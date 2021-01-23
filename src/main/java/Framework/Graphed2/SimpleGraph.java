package Framework.Graphed2;
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
   private static final long serialVersionUID = -2878278722127849913L;

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





