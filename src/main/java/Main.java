import auth.Authorization;
import db.Database;
import db.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        Authorization auth = new Authorization();
        Database db = new Database();

        if (auth.authorize(db)) {
            ReportBuilder builder = new ReportBuilder(db);
        }
    }
}