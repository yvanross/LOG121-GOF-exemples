 package Framework.Applet;
 
 import java.applet.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.font.*;
 import java.awt.geom.*;
 import javax.swing.*;
 
//  https://www.javatpoint.com/java-applet

 public class BannerApplet extends Applet
 {
    public void init()
    {
       System.out.println("Init called");
       message = getParameter("message");
       String fontname = getParameter("fontname");
       int fontsize = Integer.parseInt(getParameter("fontsize"));
       delay = Integer.parseInt(getParameter("delay"));
       font = new Font(fontname, Font.PLAIN, fontsize);
       Graphics2D g2 = (Graphics2D) getGraphics();
       FontRenderContext context = g2.getFontRenderContext();
       bounds = font.getStringBounds(message, context);
       
       timer = new Timer(delay, new
          ActionListener()
          {
             public void actionPerformed(ActionEvent event)
             {
                System.out.println("action perform");
                start--;
                if (start + bounds.getWidth() < 0) 
                   start = getWidth();
                repaint();
             }
          });
    }
 
    public void start()
    {
      System.out.println("Start");
       timer.start();
    }
 
    public void stop()
    {
       System.out.println("stop");
       timer.stop();
    }
 
    public void paint(Graphics g)
    {
      System.out.println("paint");
       g.setFont(font);
       g.drawString(message, start, (int) -bounds.getY());
    }
 
    private Timer timer;
    private int start;
    private int delay;
    private String message;
    private Font font;
    private Rectangle2D bounds;
 }