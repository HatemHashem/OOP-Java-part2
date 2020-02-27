package boxes;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        OneThingBox thisOneThing=new OneThingBox();
        thisOneThing.add(new Thing("basa",2));
        thisOneThing.add(new Thing("tata",1));
        System.out.println(thisOneThing.isInTheBox(new Thing("basa")));
        System.out.println(thisOneThing.isInTheBox(new Thing("tata")));
    }
}
