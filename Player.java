package ua.od.pindus;


public class Player {
    boolean radio;
    boolean cd;
    double[] fm = new double[3];
    String disk;

    Player() {
        radio = true;
        cd = false;
    }

    public void TurnTheRadio() {
        radio = true;
        cd = false;
    }

    public void TurnTheCd() {
        radio = false;
        cd = false;
    }

    public void SetRadioAutomatically() {
        for (double i = 89.0; i < 105.5; i += 0.10) {
            int currIndex = 0;
            while (currIndex != 3) {
                if (!(i == 89.7 || i == 102.3 || i == 105.3)) {
                    break;
                } else {
                    fm[currIndex] = i;
                    currIndex++;
                }
            }
        }
    }
}
