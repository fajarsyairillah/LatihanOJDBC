/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.JobController;
import daos.JobDao;
import java.util.ArrayList;
import java.util.List;
import models.Job;

/**
 *
 * @author USER
 */
public class ManualTestJob {

    public static void main(String[] args) {
        Connections connections = new Connections();
        System.out.println(connections.getConnection() + "\n");
        JobDao job_Dao = new JobDao();
        JobController jobController = new JobController();

//        System.out.println(job_Dao.createJob(new Job("PGR", "PROGRAMMER", 4000, 5000)));
//        System.out.println(job_Dao.updateJob(new Job("PGR", "DEVELOPER", 4000, 6000)));
//        System.out.println(jobController.delete("PGR"));
//        System.out.println(job_Dao.selectById("PGR").getTitle());
//        for (Job job : jobController.search("PGR")) {
//            System.out.println(job.getId() + " " + job.getTitle());
//        }
        jobController.getAll().forEach((job) -> {
            System.out.println(job.getId() + "||" + job.getTitle() + "||" + job.getMin_salary() + "||" + job.getMax_salary());
        });
    }

}
