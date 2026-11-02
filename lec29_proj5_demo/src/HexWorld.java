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

        int playerX = 21;
        int playerY = 15;

        while (true) {
            StdDraw.clear();
            for (int x = 0; x < WIDTH; x += 1) {
                for (int y = 0; y < HEIGHT; y += 1) {
                    world[x][y] = Tileset.NOTHING;
                }
            }

            drawHexagon(Tileset.LOCKED_DOOR,20, 15, 3, world);
            world[playerX][playerY] = Tileset.AVATAR;
            ter.drawTiles(world);

            if (StdDraw.hasNextKeyTyped()) {
                char c = StdDraw.nextKeyTyped();
                if (c == 'a') {
                    playerX -= 1;
                    // we have a bug here
                    //  in the next iteartion,
                    // world[playerX][playerY] will get an @
                    // but the old one stays
                }
                if (c == 'd') {
                    playerX += 1;
                }
            }

            StdDraw.show(30); // draws and waits 30 milliseconds
        }
    }

    // draw a hexagon
    public static void drawHexagon(TETile biome, int topLeftX, int topLeftY, int size, TETile[][] world) {
        drawLine(biome, topLeftX, topLeftY, size, world);
        drawLine(biome, topLeftX - 1, topLeftY - 1, size + 2, world);
        drawLine(biome, topLeftX - 2, topLeftY - 2, size + 4, world);
        drawLine(biome, topLeftX - 2, topLeftY - 3, size + 4, world);
        drawLine(biome, topLeftX - 1, topLeftY - 4, size + 2, world);
        drawLine(biome, topLeftX, topLeftY - 5, size, world);

        // the way I would generalize this is draw top in one nested for loop
        // then draw the bottom in a second nested for loop



        //drawLine(biome, topLeftX - 1, topLeftY - 1, size + 2, world);
        //drawLine(biome, topLeftX - 1, topLeftY - 1, size + 2, world);
        //drawLine(biome, topLeftX - 1, topLeftY - 1, size + 2, world);

    }

    // draw just one line
    public static void drawLine(TETile biome, int startX, int y, int size, TETile[][] world) {
        for (int i = 0; i < size; i += 1) {
            world[startX + i][y] = biome;
        }
    }
}
