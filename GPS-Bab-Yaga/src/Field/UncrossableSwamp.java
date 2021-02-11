package Field;

import GPS.GPS;

import java.awt.*;
import java.util.Random;

public class UncrossableSwamp extends Field {
    public UncrossableSwamp(Color color) {
        super(color);
//       super(row, col, color);
        Random rand = new Random(GPS.FOREST_SIZE);
        for (int swamps = 0; swamps <= 5; swamps++) {
            row = rand.nextInt(GPS.FOREST_SIZE);
            col = rand.nextInt(GPS.FOREST_SIZE);
        System.out.println("row:"+row+"col:" + col);
        }
    }
}

