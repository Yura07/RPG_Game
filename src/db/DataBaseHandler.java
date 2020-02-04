package db;

import heroes.Character;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection()throws ClassNotFoundException, SQLException{
        String connectionURL = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionURL, dbUser, dbPass);
        return dbConnection;
    }

    public void createCharacter(Character character){
        String insert = "INSERT INTO " + Constants.CHARACTERS_TABLE + "(" +
                Constants.CHARACTERS_NICK_NAME + "," + Constants.CHARACTERS_CLASS_ID + "," +
                Constants.CHARACTERS_HP + "," + Constants.CHARACTERS_IS_MALE + "," +Constants.CHARACTERS_POWER + ")" +
                "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = getDbConnection().prepareStatement(insert);
            statement.setString(1, character.getNickName());
            statement.setInt(2, character.getClassId());
            statement.setInt(3, character.getHp());
            statement.setInt(4, character.isMale() ? 1 : 0);
            statement.setInt(5, character.getPower());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
