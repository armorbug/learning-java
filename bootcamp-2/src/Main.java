public class Main {

    public static void main(String[] args) {
        Home home = new Home(2,true, 1200, 'A');
        home.setBedrooms(1);
        System.out.println(home.bedrooms);
        System.out.println(home.calculateYearlyPrice());
        System.out.println(home.getInfo());
        System.out.println(Home.printSuccess());
        System.out.println();

        Studio studio = new Studio(1,false,1000,'B',false);
        System.out.println(studio.getInfo());
        System.out.println(studio.iDontLikeStudios());
        System.out.println();

        Box ourBox = new Box();
        System.out.println(ourBox.why());
    }
}

