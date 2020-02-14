package com.bitedu.gui;

import com.bitedu.osm.OSResource;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.chart.LineChart;
import javafx.scene.control.TreeTableView;
public class OSMonitorController {
    private  LineChart cpuChart;
    private  TreeTableView filedStat;
    public void handleCPUSelectionChanged(Event event) {
        int x =0,y = 1;
        int s =x + y;
        System.out.println("Tab selected cpu= "+OSResource.getCPUpercetage());
    }
    public void handleSelectFile(ActionEvent actionEvent) {
        System.out.println("Button action");
    }
}
