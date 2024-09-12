import org.code.neighborhood.*;

public class FootballPainter extends BackgroundPainter {

 //paints the entire football
  public void paintFootball(String ballColor, String laceColor) {

    getToStartBall();
    paintBall(ballColor);

    resetPosition();
    
    getToStartLaces();
    paintLaces(laceColor);

    moveToCorner();
  }

  //gets to start of ball
  public void getToStartBall() {
    move();
    move();
    move();
    move();
    turnRight();
  }
    
  //paints ball portion
  public void paintBall(String color) {

    //paint the right side of ball
    setPaint(1);
    paint(color);

    move();

    setPaint(1);
    paint(color);
   
    turnLeft();
    
    move();
    turnRight();
    setPaint(1);
    paint(color);

    move();
    turnLeft();
    setPaint(1);
    paint(color);

    move();
    turnRight();

    setPaint(1);
    paint(color);

    move();

    setPaint(1);
    paint(color);
   
      move();
      turnLeft();
      move();
      turnAround();
      paintLine(color, 3);
      turnAround();
      move();
      turnRight();
    
    turnLeft();
    move();
    turnRight();
    move();
    turnLeft();

    setPaint(1);
    paint(color);
    move();
    setPaint(1);
    paint(color);

    turnRight();
    move();
    turnRight();

    paintLine(color, 3);

    turnLeft();
    move();
    turnLeft();
    move();
    move();

    setPaint(1);
    paint(color);

    turnRight();

    setPaint(1);
    paint(color);

    move();

    setPaint(1);
    paint(color);

    turnRight();
    move();

    setPaint(1);
    paint(color);

    turnLeft();
    move();
    
    setPaint(1);
    paint(color);

    turnRight();
    move();

    setPaint(1);
    paint(color);

    turnLeft();
    move();

    setPaint(1);
    paint(color);

    turnLeft();
  // Paint the left side of the ball
    
    resetPosition();

    getToStartBall();
    
    setPaint(1);
    paint(color);

    move();

    setPaint(1);
    paint(color);
   
    turnRight();
    
    move();
    turnLeft();
    setPaint(1);
    paint(color);

    move();
    turnRight();
    setPaint(1);
    paint(color);

    move();
    turnLeft();

    setPaint(1);
    paint(color);

    move();

    setPaint(1);
    paint(color);
   
      move();
      turnRight();
      move();
      turnAround();
      paintLine(color, 3);
      turnAround();
      move();
      turnLeft();
    
    turnRight();
    move();
    turnLeft();
    move();
    turnRight();

    setPaint(1);
    paint(color);
    move();
    setPaint(1);
    paint(color);

    turnLeft();
    move();
    turnLeft();

    paintLine(color, 3);

    turnRight();
    move();
    turnRight();
    move();
    move();

    setPaint(1);
    paint(color);

    turnLeft();

    setPaint(1);
    paint(color);

    move();

    setPaint(1);
    paint(color);

    turnLeft();
    move();

    setPaint(1);
    paint(color);

    turnRight();
    move();
    
    setPaint(1);
    paint(color);

    turnLeft();
    
  } 

  public void getToStartLaces() {
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
  }

  //paints the laces
  public void paintLaces(String color) {

    //paints middle lace  
    paintLine(color, 7);

    //paints right side lace
    turnLeft();
    move();
    turnLeft();

    setPaint(3);
    
    while (hasPaint()) {
    move();
    move();
    paint(color);
    }

    turnLeft();
    move();
    move();
    turnLeft();

    setPaint(3);
    while (hasPaint()) {
    paint(color);
    move();
    move();
    }
  }
  

}