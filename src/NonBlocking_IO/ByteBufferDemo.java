package NonBlocking_IO;

import java.nio.ByteBuffer;

public class ByteBufferDemo {
    public static void main(String[] args) {

        // Create a ByteBuffer of capacity 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Fill (Write) the buffer with data (characters)
        String message = "HELLO";
        for (char ch : message.toCharArray()) {
            buffer.put((byte) ch); // put each character as byte
        }

        System.out.println("Buffer filled with data.");
        printBufferState("After put()", buffer);

        // Flip the buffer to switch from write to read mode
        buffer.flip(); // sets limit = position, position = 0

        System.out.println("\nBuffer flipped to read mode.");
        printBufferState("After flip()", buffer);

        // Read (Drain) the data from buffer
        System.out.print("\nDraining buffer: ");
        while (buffer.hasRemaining()) {
            char ch = (char) buffer.get(); // get byte, convert to char
            System.out.print(ch + " ");
        }

        System.out.println("\n");
        printBufferState("After draining", buffer);
    }

    // Utility method to print buffer's state
    public static void printBufferState(String label, ByteBuffer buffer) {
        System.out.println(label);
        System.out.println("Position: " + buffer.position());
        System.out.println("Limit   : " + buffer.limit());
        System.out.println("Capacity: " + buffer.capacity());
        System.out.println("------------------------");
    }
}

