package org.kramerlab.tofuml.api.impl.services;

import java.io.InputStream;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.DatasetService;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;
import org.kramerlab.tofuml.api.impl.mediation.DatasetInterface;

public class DatasetServiceImpl extends SeitanServiceImpl<DatasetInterface>
        implements DatasetService {
    /**
     * Operation getDatasetsJSON
     *
     * @return String
     */
    public String getDatasetsJSON() {
        return null;
    }

    /**
     * Operation deleteDatasets
     *
     */
    public void deleteDatasets() {
    }

    /**
     * Operation addDataset
     *
     * @param is
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     */
    public void addDataset(InputStream is, String name, String desc) {
    }

    /**
     * Operation getDatasets
     *
     * @return Set<Datasets>
     */
    protected Set<Dataset> getDatasets() {
        return this.mediation.getDatasets();
    }

    @Override
    protected DatasetInterface intitializeMediation(String username, URI request)
            throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
