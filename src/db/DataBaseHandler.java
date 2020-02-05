package db;

import heroes.Character;
import monsters.Monster;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataBaseHandler extends Configs{
    private Connection dbConnection;

    private Connection getDbConnection()throws ClassNotFoundException, SQLException{
        String connectionURL = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + dbTimezone;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionURL, dbUser, dbPass);
        return dbConnection;
    }

    public void createCharacter(Character character){
        String insert = "INSERT INTO " + Constants.CHARACTERS_TABLE + "(" +
                Constants.CHARACTERS_NICK_NAME + "," + Constants.CHARACTERS_CLASS_NAME + "," +
                Constants.CHARACTERS_HP + "," + Constants.CHARACTERS_IS_MALE + "," +Constants.CHARACTERS_POWER + ")" +
                "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = getDbConnection().prepareStatement(insert);
            statement.setString(1, character.getNickName());
            statement.setString(2, character.getClassName());
            statement.setInt(3, character.getHp());
            statement.setInt(4, character.isMale() ? 1 : 0);
            statement.setInt(5, character.getPower());

            statement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Monster mapMonster(ResultSet resultSet) throws SQLException{
        Monster monster = new Monster();
        monster.setId(resultSet.getInt("id"));
        monster.setClassId(resultSet.getInt("class_id"));
        monster.setName(resultSet.getString("monster_name"));
        monster.setHp(resultSet.getInt("hp"));
        monster.setPower(resultSet.getInt("power"));
        return monster;
    }

    public List<Monster> getAll(){
        String select = "SELECT * FROM rpg_game.monsters";
        try {
            PreparedStatement statement = getDbConnection().prepareStatement(select);
            ResultSet resultSet = statement.executeQuery();
            List<Monster> monsters = new ArrayList<>();
            while (resultSet.next()){
                monsters.add(mapMonster(resultSet));
            }
            return monsters;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
