package ie.atu.productv3;
public class ProductDB {

    public static Product getProduct(String productCode) {

       Book  myBook = null;
       Product  myProduct = null;
       Software mySoftware = null;
       Music myMusic = null;
       TV myTV = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;

        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;

        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

            if (productCode.equalsIgnoreCase("studios")) {
                mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Visual Studios");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Microsoft 1.1");
                myProduct = mySoftware;

            } else if (productCode.equalsIgnoreCase("eclipse")) {
                mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Build Java apps");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Eclipse Neon");
                myProduct = mySoftware;

            } else if (productCode.equalsIgnoreCase("oracle")) {
                mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Latest MySQL");
                mySoftware.setPrice(54.50);
                mySoftware.setVersion("Oracle 3.0");
                myProduct = mySoftware;
            }
        if (productCode.equalsIgnoreCase("PINK")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here ");
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia group");
            myMusic.setPrice(8.00);

            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("kdl43")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setManufacture("Sony");
            myTV.setScreen_size("55");
            myTV.setPrice(819.00);
            myProduct = myTV;
        }

        return myProduct;
    }
}