PImage face;
  
  
void setup () {
  face = loadImage("face.png");
  size(800, 600);
  face.resize(width, height);
  background(face);
}

void draw () {
  background(face);
  
  //noStroke();
  fill(255,255,255);
  ellipse(460,174,50,48);
  ellipse(125,168,50,40);
  if (mouseX < 445) {
    mouseX = 445;
  }
  if (mouseY < 160) {
    mouseY = 160;
  }
  if (mouseX > 480) {
    mouseX = 480;
  }
  if (mouseY > 190) {
    mouseY = 190;
  }
  println(mouseX + " " + mouseY);
  fill(0,0,0);
  ellipse(mouseX,mouseY,10,10);
  ellipse(mouseX-(460-125),mouseY - (174-165),10,10);
  
 //445,160
 //480,160
 //480,190
 //445,190
  
}