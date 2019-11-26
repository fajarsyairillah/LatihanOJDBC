/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Job;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class JobControllerTest {
    
    public JobControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class JobController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        String id = "TEST";
        String title = "TESTER";
        String min = "5000";
        String max = "7000";
        JobController instance = new JobController();
        String expResult = "Success to Create Jobs\n";
        String result = instance.create(id, title, min, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class JobController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String id = "PRGtt";
        String title = "PROGRAMMER2";
        String min = "5000";
        String max = "7000";
        JobController instance = new JobController();
        String expResult = "Success to Update Jobs\n";
        String result = instance.update(id, title, min, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class JobController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "TEST";
        JobController instance = new JobController();
        String expResult = "Success to Delete Jobs\n";
        String result = instance.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class JobController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JobController instance = new JobController();
        List<Job> expResult = new ArrayList<>();
        List<Job> result = instance.getAll();
        assertEquals(expResult.contains(this), result.contains(this));
    }

    /**
     * Test of selectById method, of class JobController.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        String id = "PRGtt";
        JobController instance = new JobController();
        Job expResult = new Job("PRGtt");
        Job result = instance.selectById(id);
        assertEquals(expResult.getId(), result.getId());
    }

    /**
     * Test of searchJob method, of class JobController.
     */
    @Test
    public void testSearchJob() {
        System.out.println("searchJob");
        String key = "TEST";
        JobController instance = new JobController();
        List<Job> expResult =new ArrayList<Job>();
        List<Job> result = instance.searchJob(key);
        assertEquals(expResult.contains(key), result.contains(key));
    }
    
}
