package org.kramerlab.tofuml.api.impl.logic.objects;

import java.net.URI;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.apache.jena.atlas.json.JsonObject;
import org.kramerlab.seitan.api.impl.Permission;
import org.kramerlab.seitan.api.impl.database.accessors.SEITANObjectAccessor;
import org.kramerlab.seitan.api.impl.objects.SEITANObject;
import org.kramerlab.tofuml.api.impl.database.accessors.DatasetAccessor;

import weka.core.Instances;

public class Dataset extends SEITANObject {
    /** Attributes */
    /**
     * 
     */
    private Instances data;
    /** Associations */
    private DatasetAccessor accessor;

    /**
     * Operation Dataset
     *
     * @param datasetUri
     *            -
     * @param perm
     *            -
     * @return
     */
    public Dataset(URI datasetUri, Permission perm) {
        super(datasetUri, perm);
    }

    /**
     * Operation getInstances
     *
     * @return Instances
     */
    public Instances getInstances() {
        return null;
    }

    /**
     * Operation setInstances
     *
     * @param data
     *            -
     */
    public void setInstances(Instances data) {
    }

    /**
     * Operation getTrainTestSplit
     *
     * @param percentage
     *            -
     * @return List<Instances>
     */
    public List<Instances> getTrainTestSplit(double percentage) {
        return new ArrayList<Instances>();
    }

    /**
     * Operation equalHeader
     *
     * @param other
     *            -
     * @return boolean
     */
    public boolean equalHeader(Dataset other) {
        return false;
    }

    /**
     * Operation getOptions
     *
     * @return Enumeration
     */
    public Enumeration getOptions() {
        return null;
    }

    /**
     * Operation toJson
     *
     * @return String
     */
    public JsonObject toJson() {
        return null;
    }

    /**
     * Operation getObjectType
     *
     * @return String
     */
    public String getObjectType() {
        return null;
    }

    @Override
    protected SEITANObjectAccessor getAccessor(URI databaseId, Permission perm) {
        // TODO Auto-generated method stub
        return null;
    }

}
