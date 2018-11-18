package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.powp.adapter.AdapterPloterAdapter;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestJaneFigureOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTestJaneFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AdapterPloterAdapter adapterPloterAdapter = new AdapterPloterAdapter(driverManager.getCurrentPlotter());

        FiguresJane.figureScript(adapterPloterAdapter);
    }
}

