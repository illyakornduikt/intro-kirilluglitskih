package main;

import object.Door;
import object.Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
      gp.obj[0] = new Key();
      gp.obj[0].worldX = 10*gp.tileSize;
      gp.obj[0].worldY = 10*gp.tileSize;

        gp.obj[0] = new Door();
        gp.obj[0].worldX = 10*gp.tileSize;
        gp.obj[0].worldY = 10*gp.tileSize;
    }
}
