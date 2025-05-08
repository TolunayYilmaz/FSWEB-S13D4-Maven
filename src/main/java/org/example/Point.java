package org.example;

public class Point {

    private int x;
    private  int y;
    public Point(int x, int y){

        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }  public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public double distance(Point p) {
        int deltaX = p.x - this.x;
        int deltaY = p.y - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    public double distance() {
        int deltaX = 0 - this.x;
        int deltaY = 0 - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    public double distance(int a, int b) {
        int deltaX = a - this.x;
        int deltaY = b - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

}
