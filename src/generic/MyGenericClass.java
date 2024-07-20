package generic;

public class MyGenericClass <Thing> {
    Thing x;
    MyGenericClass(Thing t) {
        x = t;
    }
    public Thing getValue(){
        return x;
    }
}
