package Field;


import GPS.RenderForestField;

import java.awt.*;

public abstract class Field {
    public static final int FIELD_SIZE =100;
    protected int row;
    protected int col;
    protected Color color;


    public int getRow() {
        return this.row; }

    public int getCol() {
        return this.col;
    }

    public Field(int row, int col,Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    public Field(Color color) {
        this.color=color;
    }

    public void render(Graphics g){

        int x=this.col*FIELD_SIZE;
        int y=this.row*FIELD_SIZE;

        g.setColor(this.color);
        g.fillRect(x,y,FIELD_SIZE,FIELD_SIZE);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,FIELD_SIZE,FIELD_SIZE);
    }
}



