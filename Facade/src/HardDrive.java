public class HardDrive {
    public char[] read(long lba, int size) {
        System.out.println("HardDrive read file " + lba);
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            data[i] = (char) i;
        }
        return data;
    }
}
