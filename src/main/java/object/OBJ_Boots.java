package object;

import base.GamePanel;
import entity.Entity;

public class OBJ_Boots extends Entity {

    public OBJ_Boots(GamePanel gp) {
        super(gp);
        name = "Boots";
        down1 = setup("/objects/boots.png", gp.tileSize, gp.tileSize);
    }
}


