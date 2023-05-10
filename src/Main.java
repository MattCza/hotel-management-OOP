public class Main {
    public static void main(String[] args) {

        RoomBuilder roomBuilder = new RoomBuilder();
        Director director = new Director();
        director.defaultSingleRoom(roomBuilder);

        Room singleRoom2 = roomBuilder.buildSingleRoom();
        System.out.println(singleRoom2);

        Room singleRoom = new SingleRoom(2, 2, 27, false, true, true);



    }
}