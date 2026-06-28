import java.util.ArrayList;

public class ArrayListO {
    public static void main(String args[]) {
        ArrayList<Koo> goo = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Koo koo = new Koo();
            goo.add(koo);
            goo.get(i).setSound(i + i);
            goo.get(i).printSound();
            System.out.println(goo.get(i).getSound() + i + i);
        }
    }

}

class Koo {
    private int sound;

    public void setSound(int a) {
        sound = a;
    }

    public int getSound() {
        return sound;
    }

    public void printSound() {
        System.out.print(sound + " ");
    }

}