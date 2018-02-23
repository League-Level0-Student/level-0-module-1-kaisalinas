void setup(){
  PImage face = loadImage("happily-surprised.jpg");
face.resize(900,900);
image(face,0,0);
size(1000,1000);

}
void draw(){
  fill(68,68,68);
ellipse(330,375,70,70);
ellipse(670,375,70,70);
fill(mouseX,mouseY,0);
ellipse(330,375,50,50);
ellipse(670,375,50,50);

}