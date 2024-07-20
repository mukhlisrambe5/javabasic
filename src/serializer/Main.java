package serializer;

import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "John Doe";
        user.password = "password123";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved");
    }
}
