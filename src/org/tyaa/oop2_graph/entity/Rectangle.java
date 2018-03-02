/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2_graph.entity;

/**
 *
 * @author student
 */
public class Rectangle {
    
    public Point start;
    public int height;
    public int width;
    
    public int getS(){
        return height * width;
    }
    
    public void moveX(int _x) throws Exception{
        
        start.setX(start.getX() + _x);
    }
}
