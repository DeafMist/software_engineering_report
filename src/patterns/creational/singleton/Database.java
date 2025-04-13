package patterns.creational.singleton;

class Database {
    private static Database instance;

    private Database() {}

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}

class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        // true, так как это один объект
        System.out.println("Is singleton? " + (db1 == db2));
    }
}
