/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import daos.RegionDao;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 * kelas untuk mencoba select, insert, update, delete, select by id dan search
 *
 * @author DELL
 */
public class ManualTest {

    public static void main(String[] args) {
//        Connections connections = new Connections();
//
//        System.out.println(connections.getConnection());
//        Region region = new Region();
        RegionDao regionDao = new RegionDao();
//       System.out.println(regionDao.createRegion(new Region(5, "yee")));
//         System.out.println(regionDao.updateRegion(new Region(5, "jakarta")));
//
//        
//        //System.out.println(regionDao.deleteRegion(new Region(5)));
//        //System.out.println(regionDao.selectById(5).getName());
//

////        search
////        List<Region> regionsss = new ArrayList<>();
////        regionsss = regionDao.searchRegion("1");
//        for (Region regionss1 : regionsss) {
//            System.out.println(regionss1.getId() + " " + regionss1.getName());
//        }
        RegionController regionController = new RegionController();
        //System.out.println(regionController.create("6", "Pekanbaru"));
        // System.out.println(regionController.update("6","Surabaya"));
        System.out.println(regionController.delete("6"));

        //menampilkan versi1
//        List<Region> regions = new ArrayList<>();
//        regions = regionDao.selectRegions();
//        for (Region r : regions) {
//            System.out.println(r.getId() + " " + r.getName());
//        }
        //menampilkan versi2
        for (Region region : regionController.getAll()) {
            System.out.println(region.getId() + " " + region.getName());
        }
        // menampilkan versi3
//        regionController.getAll().forEach((region) -> {
//            System.out.println(region.getId() + " " + region.getName());
//        });

        // menampilkan select by versi 1
        //System.out.println(regionController.selectById("1").getName());

        //   menampilkan search
//        for (Region region : regionController.search("e")) {
//           System.out.println(region.getId() + " " + region.getName());
//        }
    }

}
