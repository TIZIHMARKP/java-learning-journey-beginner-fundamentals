import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Date;



public  static void main() {
    //    PACKAGES AND IMPORT KEYWORD

    Date date = new Date();
    LocalDate localDate = LocalDate.now();
    LocalDateTime localDateTime = LocalDateTime.now();

    // Another way to import a package is by using it directly as shown below
    java.sql.Date dateSql = new java.sql.Date(1);


}



