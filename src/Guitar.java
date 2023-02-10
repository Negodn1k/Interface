public class Guitar implements Instrument {
    public int countStrings;

    public Guitar(int countStrings) {
        this.countStrings = countStrings;
    }

    public void play() {
        System.out.println("Играет гитара с " + countStrings + " количеством струн" + KEY);
    }
}
