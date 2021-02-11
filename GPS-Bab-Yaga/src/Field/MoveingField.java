package Field;

import java.awt.*;
import java.util.Random;

public class MoveingField extends Field{

    public MoveingField(Color color) {
        super(color);
        Random rand=new Random();
       int start= rand.nextInt(4);
       switch (start){
           case 0:row=0;col=0; break;
           case 1:row=0;col=7; break;
           case 2:row=7;col=0; break;
           case 3:row=7;col=7; break;
           default:row=0;col=0;
       }
        System.out.println(start);
    }
}

