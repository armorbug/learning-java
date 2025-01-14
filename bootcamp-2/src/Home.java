abstract class Building {
    protected char councilTaxBand;

    abstract int calculateYearlyPrice();

    abstract String getInfo();
}

class Home extends Building {

    protected int bedrooms;
    protected final boolean hasGarden;
    protected int priceMonth;

    public void setBedrooms(int bedrooms){
        this.bedrooms = bedrooms;
    }

    public int getBedrooms(){
        return bedrooms;
    }

    public void setPriceMonth(int priceMonth){
        this.priceMonth = priceMonth;
    }

    public int getPriceMonth(){
        return priceMonth;
    }

    public boolean getHasGarden(){
        return hasGarden;
    }


    Home(int bedrooms, boolean hasGarden, int priceMonth, char councilTaxBand) {
        this.bedrooms = bedrooms;
        this.hasGarden = hasGarden;
        this.priceMonth = priceMonth;
        this.councilTaxBand = councilTaxBand;
    }

    int calculateYearlyPrice() {
        return priceMonth * 12;
    }

    String getInfo() {

        return "Bedrooms: " + bedrooms + "\n" +
                "Has garden?: " + hasGarden + "\n" +
                "Price per month: " + priceMonth + "\n" +
                "Council tax band: " + councilTaxBand;
    }

    static String printSuccess() {
        return "You did it! Congratulations on finding a home!";
    }

}

class Studio extends Home {
    boolean separateLivingRoom;
    Studio(int bedrooms, boolean hasGarden, int priceMonth, char councilTaxBand, boolean separateLivingRoom) {
        super(bedrooms, hasGarden, priceMonth, councilTaxBand);
        this.separateLivingRoom = separateLivingRoom;
    }

    String iDontLikeStudios(){
        return "I would rather not live in a studio";
    }
    String getInfo(){
        return "Bedrooms: " + bedrooms + "\n" +
                "Has garden?: " + hasGarden + "\n" +
                "Price per month: " + priceMonth + "\n" +
                "Council tax band: " + councilTaxBand + "\n" +
                "Has separate living room?: " + separateLivingRoom;
    }
}

interface NotAHome {
    int bedrooms = 0;
    int priceMonth = 0;
    char councilTax = '-';
    String why();
}

class Box implements NotAHome {
    public String why(){
        return "Because we are homeless!";
    }
}
//
//class OneBed extends Home {
//    bedrooms = 2;
//}