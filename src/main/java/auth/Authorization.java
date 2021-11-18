package auth;

import db.Database;

public class Authorization extends Авторизація{
    private Авторизація authorization;

    public Authorization () {
        this.authorization = new Авторизація();
    }

    public boolean authorize(Database database) {
        return authorization.авторизуватися(database);
    }
}