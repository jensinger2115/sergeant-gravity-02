package org.kramerlab.tofuml.api.impl.services;

import java.net.URI;

import javax.ws.rs.core.UriInfo;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.services.SeitanServiceImpl;
import org.kramerlab.tofuml.api.DatasetIDService;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;
import org.kramerlab.tofuml.api.impl.mediation.DatasetInterface;

public class DatasetIDServiceImpl extends SeitanServiceImpl<DatasetInterface>
        implements DatasetIDService {
    /**
     * Operation getDatasetJSON
     *
     * @param uri
     *            -
     * @return String
     */
    public String getDatasetJSON(UriInfo uri) {
        return null;
    }

    /**
     * Operation updateDataset
     *
     * @param uri
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateDataset(UriInfo uri, String newName, String newDesc) {
    }

    /**
     * Operation deleteDataset
     *
     * @param uri
     *            -
     */
    public void deleteDataset(UriInfo uri) {
    }

    /**
     * Operation getDataset
     *
     * @param databaseId
     *            -
     * @return Dataset
     */
    protected Dataset getDataset(URI databaseId) {
        return null;
    }

    @Override
    protected DatasetInterface intitializeMediation(String username, URI request)
            throws SEITANException {
        // TODO Auto-generated method stub
        return null;
    }
}
