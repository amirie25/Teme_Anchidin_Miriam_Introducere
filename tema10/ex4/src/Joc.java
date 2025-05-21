class Joc {
    private String echipa1, echipa2;
    private int goluriEchipa1 = 0, goluriEchipa2 = 0;
    private int totalOut = 0, totalCorner = 0;
    private static CoordinateGenerator generator = new CoordinateGenerator();

    public Joc(String echipa1, String echipa2) {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
    }

    public void simuleaza() {
        Minge minge = new Minge(50, 25); // start de la centru

        for (int i = 0; i < 1000; i++) {
            try {
                minge.suteaza();
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
            } catch (Gol g) {
                System.out.println("GOL! " + g.getMessage());
                if (minge.getX() == 0)
                    goluriEchipa2++;
                else
                    goluriEchipa1++;
                minge = new Minge(50, 25);
            } catch (Out o) {
                System.out.println("OUT! " + o.getMessage());
                totalOut++;
                // plasăm mingea la aceeași poziție
                minge = new Minge(minge.getX(), minge.getY());
            } catch (Corner c) {
                System.out.println("CORNER! " + c.getMessage());
                totalCorner++;
                // mingea se plasează în colțul terenului
                int x = (minge.getX() == 0) ? 0 : 100;
                int y = (minge.getY() < 25) ? 0 : 50;
                minge = new Minge(x, y);
            }
        }
    }

    public String toString() {
        return "Scor: " + echipa1 + " " + goluriEchipa1 + " - " + goluriEchipa2 + " " + echipa2 + "\n"
                + "Total OUT-uri: " + totalOut + "\n"
                + "Total CORNER-e: " + totalCorner;
    }
}