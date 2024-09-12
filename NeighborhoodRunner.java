import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //creates a football painter
    FootballPainter fb = new FootballPainter(); 
    
    //creates a background painter
    BackgroundPainter bp = new BackgroundPainter();

    //paints background green
    bp.paintBackground("green",12);

    fb.paintFootball("saddlebrown", "white");
  }
  }