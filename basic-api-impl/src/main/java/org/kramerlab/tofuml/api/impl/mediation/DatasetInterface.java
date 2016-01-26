package org.kramerlab.tofuml.api.impl.mediation;

import java.io.InputStream;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.kramerlab.seitan.api.impl.exceptions.SEITANException;
import org.kramerlab.seitan.api.impl.mediation.SEITANInterface;
import org.kramerlab.tofuml.api.impl.logic.objects.Dataset;

public class DatasetInterface extends SEITANInterface {
    public DatasetInterface(String username, URI request)
            throws SEITANException {
        super(username, request);
        // TODO Auto-generated constructor stub
    }

    /**
     * Operation getDataset
     *
     * @param databaseId
     *            -
     * @return Dataset
     */
    public Dataset getDataset(URI databaseId) {
        return null;
    }

    /**
     * Operation getDatasets
     *
     * @return Set<Dataset>
     */
    public Set<Dataset> getDatasets() {
        return new HashSet<Dataset>();
    }

    /**
     * Operation deleteDataset
     *
     * @param databaseId
     *            -
     */
    public void deleteDataset(URI databaseId) {
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
     * @param data
     *            -
     * @param name
     *            -
     * @param desc
     *            -
     * @return Dataset
     */
    public Dataset addDataset(InputStream data, String name, String desc) {
        return null;
    }

    /**
     * Operation updateDataset
     *
     * @param databaseId
     *            -
     * @param newName
     *            -
     * @param newDesc
     *            -
     */
    public void updateDataset(URI databaseId, String newName, String newDesc) {
    }
}
