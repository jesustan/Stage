/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Spring 2016
 *
 * Name: Tongyu Yang, Peter Unrein, Hung Giang, Adrian Berg
 * Date: Apr 26, 2016
 * Time: 9:00:42 PM
 *
 * Project: csci205FinalProject
 * Package: SpriteClasses
 * File: ExplodingTank
 * Description: ExplodingTank class
 *
 * ****************************************
 */
package SpriteClasses;

import SpriteClasses.ImageUtils.Images;

/**
 * Class that handles the exploding animations of the tanks Exploding tank is
 * extended from Explosion which is extended from Animation This class is
 * responsible for loading images of an exploding tank
 *
 * @param int x represents the starting x location in pixels
 * @param int y represents the starting y location in pixels
 *
 * @author Adrian Berg
 */
public class ExplodingTank extends Explosion {

    private long initialTime = System.currentTimeMillis();

    /**
     * Constructor for the ExlodingTank class
     *
     * @param x coordinate of the tank
     * @param y coordinate of the tank
     */
    public ExplodingTank(int x, int y) {
        super(x - 8, y - 8, Images.big_explosion);
//        loadImage("./Battle-City/image/big_explosion_1.png");
//        getImageDimensions();
    }

    @Override
    public void updateAnimation() {
        if ((System.currentTimeMillis() - initialTime) > 125) {
//            loadImage("./Battle-City/image/big_explosion_2.png");
//            getImageDimensions();
        	updateImage(Images.big_explosion2);
        }
        if ((System.currentTimeMillis() - initialTime > 500)) {
//            loadImage("./Battle-City/image/big_explosion_3.png");
//            getImageDimensions();
        	updateImage(Images.big_explosion3);
        }
        if ((System.currentTimeMillis() - initialTime > 700)) {
//            loadImage("./Battle-City/image/big_explosion_4.png");
//            getImageDimensions();
        	updateImage(Images.big_explosion4);
        }
        if ((System.currentTimeMillis() - initialTime > 900)) {
//            loadImage("./Battle-City/image/big_explosion_5.png");
//            getImageDimensions();
        	updateImage(Images.big_explosion5);
        }
        if ((System.currentTimeMillis() - initialTime > 1100)) {
            super.vis = false;
        }
    }

}
