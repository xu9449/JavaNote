package com.sean.debug12.jdbc;

import com.sean.debug12.model.Adopter;
import com.sean.debug12.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdopterJDBCDao {
    static final String DBURL = "jdbc:postgresql://localhost:5431/pet";
    static final String USER = "admin";
    static final String PASS = "password";

    private static Logger logger = LoggerFactory.getLogger(AdopterJDBCDao.class);


    public static void main (String[] args) {
        AdopterJDBCDao adopterJDBCDao = new AdopterJDBCDao();
        System.out.println(adopterJDBCDao.getAdopter());
        logger.debug("Debug");
        logger.info("infor");
        logger.warn("warn");

    }

    public List<Pet> getAdopter() {


        List<Pet> adopters = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            //STEP 3: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM adopter";
            rs = stmt.executeQuery(sql);
            //STEP 4: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String tel = rs.getString("tel");
                String email = rs.getString("email");
                String location = rs.getString("location");
                String pet_id = rs.getString("pet_id");

                //Fill the object
                Adopter adopter = new Adopter();
                adopter.setId(id);
                adopter.setName(name);
                adopter.setDescription(description);
                adopter.setTel(tel);
                adopter.setEmial(email);
                adopter.setLocation(location);
                adopter.setPet_id(pet_id);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //STEP 6: finally block used to close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return adopters;
    }
}
