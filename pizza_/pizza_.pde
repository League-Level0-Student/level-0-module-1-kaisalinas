PImage pepperoni;
void setup(){  size(1000,1000);
fill(165,42,42);
ellipse(500,500,200,200);
 pepperoni = loadImage("pizzaTopping.jpg");
pepperoni.resize(10,10);
image(pepperoni, 10, 10);}
void draw(){

if (mousePressed){
image(pepperoni, mouseX, mouseY);
}
}