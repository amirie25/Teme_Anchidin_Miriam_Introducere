class Minge {
    private int x, y;
    private static CoordinateGenerator generator = new CoordinateGenerator();

    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void suteaza() throws Out, Gol, Corner {
        this.x = generator.generateX();
        this.y = generator.generateY();

        if (y == 0 || y == 50) {
            throw new Out("Mingea a iesit in out!");
        }

        if ((x == 0 || x == 100) && (y >= 20 && y <= 30)) {
            throw new Gol("GOL!");
        }

        if ((x == 0 || x == 100) && ((y > 0 && y < 20) || (y > 30 && y < 50))) {
            throw new Corner("Corner!");
        }
    }
}