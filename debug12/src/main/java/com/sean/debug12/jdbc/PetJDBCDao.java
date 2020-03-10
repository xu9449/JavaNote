package com.sean.debug12.jdbc;

import com.sean.debug12.model.Pet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetJDBCDao {

    static final String DBURL = "jdbc:postgresql://localhost:5431/pet";
    static final String USER = "admin";
    static final String PASS = "password";

    public static void main (String[] args) {
        PetJDBCDao petJDBCDdao = new PetJDBCDao();
        System.out.println(petJDBCDdao.getPet().size());
    }

    public List<Pet> getPet() {


        List<Pet> pets = new ArrayList<>();
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
            sql = "SELECT * FROM pet";
            rs = stmt.executeQuery(sql);
            //STEP 4: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String breed = rs.getString("breed");
//                String shelter = rs.getString("shelter");
//                Date adoptdate = rs.getDate("adoptdate");
                //Fill the object
                Pet pet = new Pet();
                pet.setId(id);
                pet.setName(name);
                pet.setDescription(description);
                pet.setBreed(breed);
                pets.add(pet);

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
        return pets;
    }
}


