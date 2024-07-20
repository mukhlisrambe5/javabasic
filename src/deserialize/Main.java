package deserialize;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Deserialize an object from a file
        User user = null;

        FileInputStream fileIn = new FileInputStream("D:\\PROJECT APP\\Java\\javabasic\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
