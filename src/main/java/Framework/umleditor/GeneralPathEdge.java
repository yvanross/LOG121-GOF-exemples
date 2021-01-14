import java.awt.*;
import java.awt.geom.*;

/**
   A class that assumes that an edge can yield its shape
   as a general path, and then takes advantage of the fact
   that containment testing can be done by fattening the
   general path.
*/
abstract class GeneralPathEdge extends AbstractEdge
{  
   /**
      Returns the path that should be stroked to
      draw this edge. The path does not include
      arrow tips or labels.
      @return a path along the edge
   */
   public abstract GeneralPath getPath();

   public boolean contains(Point2D aPoint)
   {
      final double MAX_DIST = 3;

      // the end points may contain small nodes, so don't
      // match them
      Line2D conn = getConnectionPoints();
      if (aPoint.distance(conn.getP1()) <= MAX_DIST 
         || aPoint.distance(conn.getP2()) <= MAX_DIST)
         return false;

      GeneralPath p = getPath();
      BasicStroke fatStroke = new BasicStroke(
         (float)(2 * MAX_DIST));
      Shape fatPath = fatStroke.createStrokedShape(p);
      return fatPath.contains(aPoint);
   }
}
