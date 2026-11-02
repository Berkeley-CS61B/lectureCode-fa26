package lec29_proj5_demo.src;

import edu.princeton.cs.algs4.StdDraw;
import lec29_proj5_demo.src.tileengine.TERenderer;
import lec29_proj5_demo.src.tileengine.TETile;
import lec29_proj5_demo.src.tileengine.Tileset;

/**
 * Live-coding starter: draw a world of hexagons, then make it interactive.
 * A finished version is in the finished/ package if you need to peek.
 */
public class HexWorld {
    private static final int WIDTH = 45;
    private static final int HEIGHT = 45;
    private static final int HEX_SIZE = 4;

    void main() {
        TERenderer ter = new TERenderer();
        ter.initialize(WIDTH, HEIGHT); // creates a 45 x 45 window

        TETile[][] world = new TETile[WIDTH][HEIGHT];
        for (int x = 0; x < WIDTH; x += 1) {
            for (int y = 0; y < HEIGHT; y += 1) {
                world[x][y] = Tileset.NOTHING;
            }
        }

        // TODO: draw a single hexagon, then a column of hexagons, then the whole tesselation.

        // TODO: add an avatar and move it with w/a/s/d.

        StdDraw.clear();
        ter.drawTiles(world);
        StdDraw.show();
    }
}
