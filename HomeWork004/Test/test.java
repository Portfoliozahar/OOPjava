package HomeWork004.Test;


import HomeWork004.DataBase.TestDb.InitializerDb;


public class test {
    public static void main(String[] args) {
        InitializerDb db = new InitializerDb();
        System.out.println(db.getAllChats().toString());
       
    }
}
