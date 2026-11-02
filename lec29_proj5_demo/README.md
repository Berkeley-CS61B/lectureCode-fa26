# Lecture 29: Software Engineering I (BYOW)

Starter code for the live demo. Everything here is a plain copy of the Project 5
tile engine plus a few demos; the only file meant to be edited during lecture is
`src/HexWorld.java`.

- `src/tileengine/` — `TERenderer`, `TETile`, `Tileset` (same as the Project 5 skeleton).
- `src/utils/RandomUtils.java` — seeded random helpers.
- `src/demo/BoringWorldDemo.java` — draw a world with one rectangle.
- `src/demo/RandomWorldDemo.java` — fill a world with random tiles.
- `src/demo/GameLoopDemo.java` — the `while (true)` / `hasNextKeyTyped` pattern for interactivity.
- `src/demo/ExampleSaveLoad.java` — reading and writing a file with `In`/`Out`.
- `src/HexWorld.java` — starter for the hexagon world (what gets built in lecture).
- `src/finished/` — a completed `HexWorld` (`HexWorldFinished`, `Hexagon`, `DrawUtils`) for reference.

Needs `algs4.jar` from `library-fa26` on the classpath (StdDraw, StdRandom, In, Out).
