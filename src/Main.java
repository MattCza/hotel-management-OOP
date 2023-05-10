public class Main {
    public static void main(String[] args) {

        RoomBuilder roomBuilder = new RoomBuilder();
        Director director = new Director();
        director.defaultSingleRoom(roomBuilder);

        Room singleRoom1 = roomBuilder.buildSingleRoom();
        System.out.println(singleRoom1);

        director.defaultDoubleRoom(roomBuilder);
        Room doubleRoom1 = roomBuilder.buildDubleRoom();
        System.out.println(doubleRoom1);




    }
}