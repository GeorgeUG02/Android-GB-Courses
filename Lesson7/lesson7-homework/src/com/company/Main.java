package com.company;

public class Main {

    public static void main(String[] args) {
        Entity[] entities = {
                new Cat(),
                new Man(),
                new Robot()
        };
        Obstacle[] obstacles = {
                new Tread(1000),
                new Wall(5)
        };
        for (Obstacle o : obstacles) {
            for (Entity e : entities) {
                if (e.isParticipating() == true) o.overcome(e);
            }
        }
        String[][] a = {{"3", "5", "10", "122"}, {"5", "7", "130", "24"}, {"30", "100", "h5", "10"}, {"25", "50", "7", "3"}};
        int s = arraySum(a);
        System.out.println(s);
    }

    public static int arraySum(String[][] a) {
        if (a.length != 4) throw new MyArraySizeException();
        if (a[0].length != 4 || a[1].length != 4 || a[2].length != 4 || a[3].length != 4)
            throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}