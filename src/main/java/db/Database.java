package db;

public class Database extends БазаДаних{
    private БазаДаних db;

    public Database() {
        this.db = new БазаДаних();
    }

    public String getUserData(){
        return db.отриматиДаніКористувача();
    }

    public String getStaticData(){
        return db.отриматиСтатистичніДані();
    }
}