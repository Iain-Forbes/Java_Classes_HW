public class Printer {

    private int paper;
    private int tonerVolume;


    public Printer(int paper, int tonerVolume) {
        this.paper = paper;
        this.tonerVolume = tonerVolume;

    }

    public int getCurrentPaper() {
        return paper;
    }

    public int getTonerLeft() {
        return tonerVolume;
    }


    public void startPrinting(int numPages, int numCopies) {
        int totalPages = numCopies * numPages;
        if (totalPages <= paper && totalPages <= tonerVolume) {
            paper -= totalPages;
            tonerVolume -= totalPages;
        }

    }
}




