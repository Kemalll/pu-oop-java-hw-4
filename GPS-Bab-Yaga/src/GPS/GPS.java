package GPS;
import Field.Field;
import Field.UnchartedField;
import Field.MoveingField;
import Field.UncrossableSwamp;
import Field.SafeField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GPS extends JFrame implements MouseListener {
    public static final int FOREST_SIZE = 8;

    Field[][] forest;

    public GPS() {
        this.forest = new Field[FOREST_SIZE][FOREST_SIZE];
        int currentCol;
        int currentRow;


        for (currentRow = 0; currentRow < FOREST_SIZE; currentRow++) {
            for (currentCol = 0; currentCol < FOREST_SIZE; currentCol++) {
                forest[currentRow][currentCol] = (new UnchartedField(currentRow, currentCol, Color.GREEN));

            }
        }
        UncrossableSwamp us = new UncrossableSwamp(Color.BLUE);
        currentCol = us.getCol();
        currentRow = us.getRow();
        forest[currentRow][currentCol] = (new UncrossableSwamp(Color.BLUE));
        forest[7][7]=new MoveingField(Color.YELLOW);
//        MoveingField mf=new MoveingField(Color.YELLOW);
//        currentCol = mf.getCol();
//        currentRow=  mf.getRow();
//        forest[currentRow][currentCol] = (new MoveingField(Color.YELLOW));

            this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }


    public void paint(Graphics g) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                this.renderSpecialField(g,row,col);

            }
        }
    }


        private Field getField(int row,int col){
        return this.forest[row][col];
    }
    private boolean hasSpecialField(int row,int col){
        return this.getField(row,col) !=null;
    }

    private void renderSpecialField(Graphics g,int row,int col){

        if(this.hasSpecialField(row,col)) {
            Field f = this.getField(row, col);
            f.render(g);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}




