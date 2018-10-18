package ad16;

import com.sun.istack.internal.logging.Logger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AD16 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serial.txt"));
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("serial.txt"));
            String[] cod = {"p1", "p2", "p3"};
            String[] desc = {"parafusos", "cravos", "tachas"};
            int[] price = {3, 4, 5};
            for (int i = 0; i < cod.length; i++) {
                Producto p1 = new Producto(cod[i], desc[i], price[i]);
                os.writeObject(p1);
            }
            os.writeObject(null);
            os.close();

            Producto p2 = (Producto) is.readObject();
            while (p2 != null) {
                System.out.println(p2.toString());
                p2 = (Producto) is.readObject();
            }
            is.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();

        }





//try{
//    String[] cod={"p1","p2","p3"};
//    String[] desc ={"parafusos","cravos ","tachas"};
//    Double[] prezo ={3.0,4.0,5.0};
//  
//    ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("serial.txt"));
//    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));
//    
//    for (int i=0;i<cod.length;i++){
//        
//        Producto p1 = new Producto(cod[i],desc[i],prezo[i]);
//        ous.writeObject(p1);
//        }
//        ous.writeObject(null);
//        ous.close();
//        
//        Producto p2 = (Producto)ois.readObject();
//        while(p2 != null){
//            System.out.println(p2.toString());
//            p2 = (Producto) ois.readObject();
//        }
//        ois.close();
//    }catch (IOException ex){
//        ex.printStackTrace();
//    }
//        
//    
//    
//    
 }
    
}
