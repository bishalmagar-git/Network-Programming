package NonBlocking_IO;

import java.nio.ByteBuffer;

public class ByteBufferSimple {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        buffer.put((byte)'H');
        buffer.put((byte)'I');

        buffer.flip(); //Switch to read mode

        //Read characters from buffer
        while (buffer.hasRemaining()){
            System.out.println((char) buffer.get());  //Drain
        }
    }
}

