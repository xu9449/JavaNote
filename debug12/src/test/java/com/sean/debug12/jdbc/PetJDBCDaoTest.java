package com.sean.debug12.jdbc;

import com.sean.debug12.model.Pet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PetJDBCDaoTest {
    private PetJDBCDao petDao;

    @Before
    public void init() {
        petDao = new PetJDBCDao();
    }

    @Test
    public void getPetsTest() {
        List<Pet> pets = petDao.getPet();
        int expectedNumbOfDept = 4;

        Assert.assertEquals(expectedNumbOfDept, pets.size());

    }

}
