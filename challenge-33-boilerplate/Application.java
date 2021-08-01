public class Application {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        analyzer.createSortedPriceFile();
        long startTimePrice = System.currentTimeMillis();
        analyzer.file_write();
        long endTimePrice = System.currentTimeMillis();
        System.out.println("Time taken to sorting the list on the basis of price in ascending order : "+(endTimePrice-startTimePrice));
        System.out.println();
        analyzer.createSortedRatingFile();
        long startTime = System.currentTimeMillis();
        analyzer.fileWriteRating();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to sorting the list on the basis of rating in descending order : "+(endTime-startTime));
        System.out.println();
    }
}

