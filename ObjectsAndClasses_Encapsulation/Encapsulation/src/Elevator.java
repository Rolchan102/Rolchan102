public class Elevator {
    private int minFloor;
    private int maxFloor;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp(int floor) {
        for (int a = currentFloor; a <= floor; a++)
            System.out.println("����: " + a);
        currentFloor = floor;
        System.out.println("���� �� " + getCurrentFloor() + " �����");
    }

    public void moveDown(int floor) {
        for (int b = currentFloor; b >= floor; b--)
            System.out.println("����: " + b);
        currentFloor = floor;
        System.out.println("���� �� " + getCurrentFloor() + " �����");
    }

    public void move(int floor) {
        if (floor > currentFloor && floor <= maxFloor){
            moveUp(floor);
        } else if (floor < currentFloor && floor >= minFloor) {
            moveDown(floor);
        } else if (floor > maxFloor || floor < minFloor) {
            System.out.println("�������� ����!");
        }
    }
}
